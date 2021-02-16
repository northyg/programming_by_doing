/*
Write a program that gets an integer from the user. Count from 0 to that number. Use a for loop to do it.
http://programmingbydoing.com/a/counting-machine.html
 */

import java.util.*;

class CountingMachine{

    public static void countNumbers(int numberToCountTo) {
        for (int i = 0; i <= numberToCountTo; ++i){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int numberToCountTo;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many numbers should I count to? ");
        numberToCountTo = keyboard.nextInt();
        countNumbers(numberToCountTo);
    }
}
