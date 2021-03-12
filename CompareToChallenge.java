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

NOTE: I tried making a method with compareTo() in it, but it was throwing a class Object error?
Putting it back into main worked... Why?

CompareToChallenge.java:26: error: cannot find symbol
                System.out.println(listA.get(i).compareTo(listB.get(i)));
                                               ^
  symbol:   method compareTo(Object)
  location: class Object
*/

import java.util.*;

class CompareToChallenge {

        public static void main (String[]args){

            List<String> listA = Arrays.asList("Doggy", "Catly", "Apple", "Bravo", "Charlie", "Delta", "Echo", "Foxtroty", "Golfie", "Hotelss", "Indiana", "Juliety");
            List<String> listB = Arrays.asList("Doggy", "Catly", "Appley", "Bravoest", "Charlies", "Deltas", "Echoswims", "Foxtrot", "Golf", "Hotel", "India", "Juliet");

            int listASize = listA.size();
            int listBSize = listB.size();

            if (listASize == listBSize) {
                for (int i = 0; i < listA.size(); ++i) {
                    System.out.print("Comparing " + listA.get(i) + " and " + listB.get(i) + " produces ");
                    System.out.println(listA.get(i).compareTo(listB.get(i)));
                }
            }
            else{
                System.out.println("List sizes do not match! Check ye lists!");
            }
        }
    }