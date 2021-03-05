/*
https://programmingbydoing.com/a/one-shot-hi-lo.html

Write a program that picks a random number from 1-100.
Give the user a chance to guess it. If they get it right, tell them so.
If their guess is higher than the number, say "Too high."
If their guess is lower than the number, say "Too low." Then quit. (They don't get any more guesses for now.)

How much wood would a wood chuck chuck if a wood chuck could chuck wood?
 */

import java.util.*;

public class OneShotHiLo {

    public static void generateRandom(int guess, int randomRange){
        Random roll = new Random();
        int rolly = roll.nextInt(randomRange) + 1;

        if(guess > rolly){
            System.out.println("Sorry too high! I was thinking of " + rolly);
        }
        else if(guess < rolly){
            System.out.println("Sorry too low! I was thinking of " + rolly);
        }
        else if(guess == rolly){
            System.out.println("You guessed it! What are the odds of guessing " + rolly);
        }
        else{
            System.out.println("You broke this somehow!");
        }
    }

    public static void main(String[] args) {

        int guess;
        int randomRange = 100;
        int numberOfTries = 10;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-00. Try to guess it!");
        guess = keyboard.nextInt();

        // modified to run method multiple times for testing
        for(int i = 0; i < numberOfTries; ++i){
            generateRandom(guess, randomRange);
        }
    }
}
