/*
https://programmingbydoing.com/a/high-score.html

Write a dumb little program that asks the user for their name and a number.
Then store that name and that "high score" in a file. The file should be called "score.txt".

Bugz: If the Int or String is anything but that, then the input ends up on the next line or cut off...
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HighScore {

    public static void writeToFile(int score, String name){
        try{
            java.io.File myFile = new java.io.File("score.txt");
            FileWriter writer = new FileWriter(myFile);
            writer.write(String.valueOf(score) + "\n");
            writer.write(name + "\n");
            writer.close();
        } catch (IOException io){
            io.printStackTrace();
        }
        System.out.println("Value's stored are: The score is " + score + "\tName is " + name);
        System.out.println("Data store into score.txt");
    }

    public static int getInt(int score, Scanner myScanner) {
        // If number entered is not an int, then default is 0
        System.out.print("Please enter your score: ");
        if (myScanner.hasNextInt()) {
            score = myScanner.nextInt();
        }
        return score;
    }

    public static String getString(String name, Scanner myScanner) {
        System.out.print("Please enter your name: ");
        if (myScanner.hasNext()) {
            name = myScanner.next();
            myScanner.close();
        }
        return name;
    }

    public static void main(String[] args) {

        int score = 0;
        String name = "SomeName";
        Scanner myScanner = new Scanner(System.in);

        score = getInt(score, myScanner);
        name = getString(name, myScanner);
        writeToFile(score, name);
    }
}
