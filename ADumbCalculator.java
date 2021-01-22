/*
http://programmingbydoing.com/a/a-dumb-calculator.html
A Dumb Calculator
Make a simple numeric calculator. It should prompt the user for three numbers.
Then add the numbers together and divide by 2. Display the result.
Your program must support numbers with decimals and not just integers.

 */
import java.util.*;

class ADumbCalculator{

    public static double addInts(double inputOne, double inputTwo, double inputThree){
        double addedNumbers = inputOne + inputTwo + inputThree;
        return addedNumbers;
    }

    public static double divideNumber(double addedNumbers){
        double solution = addedNumbers / 2;
        return solution;
    }

    public static void main(String[] args) {

        double inputOne;
        double inputTwo;
        double inputThree;
        int numToDivide = 2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your first number? ");
            inputOne = keyboard.nextDouble();
        System.out.print("What is your second number? ");
            inputTwo = keyboard.nextDouble();
        System.out.print("What is your third number? ");
            inputThree = keyboard.nextDouble();

        double addedNumbers = addInts(inputOne, inputTwo, inputThree);
        double solution = divideNumber(addedNumbers);
        System.out.println("( " + inputOne + " + " + inputTwo + " + " + inputThree + ") / " + numToDivide + " is... " + solution);
    }
}
