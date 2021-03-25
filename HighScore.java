/*
Write a dumb little program that asks the user for their name and a number.
Then store that name and that "high score" in a file. The file should be called "score.txt".
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HighScore {

    public static void writeToFile(int score, String name){
        try{
            java.io.File myFile = new java.io.File("score.txt");
            FileWriter writer = new FileWriter(myFile);
            writer.write(score);
            writer.write(name);
            writer.close();
        } catch (IOException io){
            io.printStackTrace();
        }
        System.out.println("Data store into score.txt");
    }

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your score: ");
        int score = myScanner.nextInt();

        System.out.println("Please enter your name: ");
        String name = myScanner.nextLine();

        writeToFile(score, name);
    }
}
