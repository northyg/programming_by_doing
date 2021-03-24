/*
https://programmingbydoing.com/a/basic-arraylists-1.html

Create an ArrayList that can hold Integers. Add ten copies of the number -113 to the ArrayList. Then display the contents of the ArrayList on the screen.

This time, you must use a loop, both to fill up the ArrayList and to display it.
Also, in the condition of your loop, you should not count up to a literal number.
Instead you should use the size() of your ArrayList.

Notes: For loop will not work with size() because initial capacity is 10, but the SIZE is not 10
until it fills up.and someList.size(). Use a while loop.
 */

import java.util.*;

public class BasicArrayListsOne {

    public static void main(String[] args) {

        int numToAdd = -113;
        int howManyToAdd = 10;
        int index = 0;

        ArrayList<Integer> someList = new ArrayList<Integer>(10);

        while (someList.size() < howManyToAdd) {
            someList.add(numToAdd);
        }

        while (index < someList.size()) {
            System.out.println("Slot " + index + " contains a " + someList.get(index));
            ++index;
        }
    }
}

