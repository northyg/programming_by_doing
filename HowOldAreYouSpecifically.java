/*
http://programmingbydoing.com/a/how-old-are-you-elseif.html

How Old Are You, Specifically?
Using if statements, else if, and else statements, make a program which displays a different message depending on the age given.

age	message
less than 16	"You can't drive."
16 to 17	"You can drive but not vote."
18 to 24	"You can vote but not rent a car."
25 or older	"You can do pretty much anything."
 */

import java.util.*;

class HowOldAreYouSpecifically{

    public static void printMessage(String name, int age){
        if(age < 16){
            System.out.println("You can't drive, " + name + ".");
        }
        if(age == 16 || age == 17){
            System.out.println("Yoou can drive but not vote, " + name+ ".");
        }
        if(age > 17 && age < 25){
            System.out.println("You vote but not rent a car, " + name+ ".");
        }
        if(age >= 25){
            System.out.println("You can do pretty much anything, " + name+ ".");
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
