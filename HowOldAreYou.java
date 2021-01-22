/*
http://programmingbydoing.com/a/how-old-are-you.html

How Old Are You?
Make a program which displays a different message depending on the age given. Here are the possible responses:

age is less than 16, say "You can't drive."
age is less than 18, say "You can't vote."
age is less than 25, say "You can't rent a car."
age is 25 or over, say "You can do anything that's legal."
Here's a sample run. Notice that a person who is under 16 will display three messages, one for being under 16, one for also being under 18, and one for also being under 25.
 */

import java.util.*;

class HowOldAreYou {

    public static void printMessage(String name, int age){
        if(age < 16){
            System.out.println("You can't drive " + name + ".");
        }
        if(age < 18){
            System.out.println("You can't vote " + name+ ".");
        }
        if(age < 25){
            System.out.println("You can't rent a car " + name+ ".");
        }
        if(age >= 25){
            System.out.println("You can do anything that's legal " + name+ ".");
        }
    }

    public static void main(String[] args) {

        String name;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hey, what's your name?!? ");
            name = keyboard.next();
        System.out.print("Ok " + name + ", how old are you? ");
            age = keyboard.nextInt();
        printMessage(name, age);
    }
}
