/*
https://programmingbydoing.com/a/counting-machine-revisited.html

Counting Machine Revisited

Write a program that gets three integers from the user.
Count from the first number to the second number in increments of the third number.
Use a for loop to do it.

*/
import java.util.*;

public class CountingMachineRevisited {

    public static void countNumbers(int firstNum, int secondNum, int thirdNum) {

        if (firstNum < secondNum) {
            for (int i = firstNum; i <= secondNum; i += thirdNum) {
                System.out.print(i + " ");
            }
        }
        else {
            System.out.print("First number was not less than second number, try again!");
        }
    }

    public static void main(String[] args) {

        int firstNum;
        int secondNum;
        int thirdNum;
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Count from what number: ");
        firstNum = myScanner.nextInt();

        System.out.print("Count to: ");
        secondNum = myScanner.nextInt();

        System.out.print("Count by: ");
        thirdNum = myScanner.nextInt();

        countNumbers(firstNum, secondNum, thirdNum);
    }
}
