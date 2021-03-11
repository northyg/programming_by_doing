/*
https://programmingbydoing.com/a/compareto-challenge.html

compareTo() Challenge
Write a program that compares several Strings using the compareTo() method. You should display the Strings and display the integer that compareTo() gives you.

You must have five examples which result in a number less than 0, five examples which result in a number greater than 0, and two examples which give you exactly 0. 
This means you need a total of twelve examples.

You may not just flip the Strings around; you must have twelve different examples.

The Java String compareTo() method is used for comparing two strings lexicographically. 
Each character of both the strings is converted into a Unicode value for comparison. 
If both the strings are equal then this method returns 0 else it returns positive or negative value.
The result is positive if the first string is lexicographically greater than the second string else the result would be negative.
https://beginnersbook.com/2013/12/java-string-compareto-method-example/

*/
import java.util.*;

class CompareToChallenge {
    
    public static void main(String[] args) {

        List<String> listA = Arrays.asList("Doggy", "Catly", "Apple", "Bravo", "Charlie", "Delta", "Echo", "Foxtroty", "Golfie", "Hotelss", "Indiana", "Juliety");
        List<String> listB = Arrays.asList("Doggy", "Catly", "Appley", "Bravoest", "Charlies", "Deltas", "Echoswims", "Foxtrot", "Golf", "Hotel", "India", "Juliet");

        // compareTo looks to work, but unclear why it prints so many times...
        for (String nameOne : listA) {
            for (String nameTwo : listB){
                System.out.println(nameOne.compareTo(nameTwo));
            }
        }
    }
}