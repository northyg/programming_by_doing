/*
http://programmingbydoing.com/a/ten-times.html
Write a program that prints the important phrase "Mr. Mitchell is cool." on the screen ten times. Use a for loop to do it.
 */

import java.util.*;

class TenTimes {

    public static void LoopyLoop(int numberTimesToLoop) {
        for (int i = 0; i < numberTimesToLoop; ++i) {
            System.out.println("Giselle is cool this many times: " + i);
        }
    }

    public static void main(String[] args) {

        int numberTimesToLoop = 10;
        LoopyLoop(numberTimesToLoop);
    }
}
