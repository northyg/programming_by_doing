/*
http://programmingbydoing.com/a/fortune-cookie.html
Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.

For bonus points, also add randomly-chosen lotto numbers to the fortune. In Texas, the lotto chooses 6 numbers, each from 1-54.
 */

import java.util.*;

class FortuneCookie {

    public static void randomFortune(int randomFortuneNumber){

        System.out.print("The cookie says: ");

        if(randomFortuneNumber == 0) {
            System.out.println("You will be driven insane by your children.");
        }
        else if(randomFortuneNumber == 1){
            System.out.println("Don't eat the yellow snow.");
        }
        else if(randomFortuneNumber == 2) {
            System.out.println("Always zig, never zag");
        }
        else if(randomFortuneNumber == 3){
            System.out.println("Don't believe their lies.");
        }
        else if(randomFortuneNumber == 4){
            System.out.println("Hakuna Matata");
        }
        else if(randomFortuneNumber == 5) {
            System.out.println("Some dogs are brown");
        }
        else{
            System.out.println("IT BROKE - you shouldn't get here.");
        }
    }

    public static int luckyNumbers(int luckyNumberToRoll){
        Random dice = new Random();
        int roll = dice.nextInt(luckyNumberToRoll) + 1; // plus 1 so that it won't roll a 0
        return roll;
    }

    public static void main(String[] args) {

        int luckyNumberToRoll = 53;
        int numberOfLottoToRoll = 5;
        int numberToRoll = 5;
        Random dice = new Random();
        int randomFortuneNumber = dice.nextInt(numberToRoll);
        randomFortune(randomFortuneNumber);

        // Roll the lottery numbers
        for(int i = 0; i < numberOfLottoToRoll; ++i){
            int roll = luckyNumbers(luckyNumberToRoll);
            System.out.print(roll + " - ");
        }
        int roll = luckyNumbers(luckyNumberToRoll);
        System.out.print(roll + "\n");
    }
}
