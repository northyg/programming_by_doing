/*
http://programmingbydoing.com/a/dice.html
Write a program that simulates a dice roll by picking a random number
 from 1-6 and then picking a second random number from 1-6. Add the two
 values together, and display the total.
 */

import java.util.*;

class Dice {

    public static int justRollsDice(int numberToRoll){
        Random dice  = new Random();
        int roll = dice.nextInt(numberToRoll);
        return roll;
    }

    public static void main(String[] args) {
        int numberToRoll = 6;

        System.out.println("HERE COMES THE DICE!");

        int randOne = justRollsDice(numberToRoll);
        int randTwo = justRollsDice(numberToRoll);

        System.out.println("Roll #1: " + randOne);
        System.out.println("Roll #2: " + randTwo);

        int total = randOne + randTwo;

        System.out.println("The total is " + total);
    }
}
