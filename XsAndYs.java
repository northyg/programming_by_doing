/*
https://programmingbydoing.com/a/xs-and-ys.html

Write another program that uses a for loop. With the loop, make the variable x go from -10 to 10, counting by 0.5.
(This means that x can't be an int.)

Inside the body of the loop, make another variable y become the current value of x squared.
Then display the current values of both x and y.
 */

import java.util.*;

public class XsAndYs {

    public static void loopyLoop(double x, double y, double numberToLoopTo, double numberToIncreaseBy) {

        System.out.println("x" + "\t" + "y" + "\n-----------------");
        System.out.println(x + "\t" + y);
        for(int i = 0; x < numberToLoopTo; ++i){
            x = x + numberToIncreaseBy;
            y = x * x;
            System.out.println(x + "\t" + y);
        }
    }

    public static void main(String[] args) {
        double x = -10;
        double y = x * x;
        double numberToLoopTo = 10.0;
        double numberToIncreaseBy = 0.5;

        loopyLoop(x, y, numberToLoopTo, numberToIncreaseBy);
    }
}
