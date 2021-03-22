/*
https://programmingbydoing.com/a/basic-arraylists-0.html

Create an ArrayList that can hold Integers. Add ten copies of the number -113 to the ArrayList.
Then display the contents of the ArrayList on the screen.

Do not use a loop. Also, do not use any variable for the index; you must use literal numbers to refer to each slot.

My edit: Added other numbers instead of -113 so it was easier to test. Why add a bunch of -113 anyway?
 */

import java.util.*;

public class BasicArrayListsZero {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>(10);

        myList.add(0, -00);
        myList.add(1, -11);
        myList.add(2, -22);
        myList.add(3, -33);
        myList.add(4, -44);
        myList.add(5, -55);
        myList.add(6, -66);
        myList.add(7, -77);
        myList.add(8, -88);
        myList.add(9, -99);

        System.out.println("Printing the full array " + myList);
        System.out.println("Slot " + myList.indexOf(-00) + " contains a " + myList.get(0));
        System.out.println("Slot " + myList.indexOf(-11) + " contains a " + myList.get(1));
        System.out.println("Slot " + myList.indexOf(-22) + " contains a " + myList.get(2));
        System.out.println("Slot " + myList.indexOf(-33) + " contains a " + myList.get(3));
        System.out.println("Slot " + myList.indexOf(-44) + " contains a " + myList.get(4));
        System.out.println("Slot " + myList.indexOf(-55) + " contains a " + myList.get(5));
        System.out.println("Slot " + myList.indexOf(-66) + " contains a " + myList.get(6));
        System.out.println("Slot " + myList.indexOf(-77) + " contains a " + myList.get(7));
        System.out.println("Slot " + myList.indexOf(-88) + " contains a " + myList.get(8));
        System.out.println("Slot " + myList.indexOf(-99) + " contains a " + myList.get(9));
    }
}
