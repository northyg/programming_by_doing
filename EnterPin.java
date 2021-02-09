/*
http://programmingbydoing.com/a/enter-pin.html
Write a while loop that checks for correct pin.
 */

import java.util.*;

class EnterPin {

    public static void pinChecker(int pin, int passedInput, Scanner keyboard) {
        int input = passedInput;
        while (input != pin){
           System.out.println("Incorrect Pin. Try again.");
           System.out.println("Enter your Pin: ");
           input = keyboard.nextInt();
        }
            System.out.println("Pin accepted. You now have access to your account.");
    }

    public static void main(String[] args) {

        int pin = 12345;
        int passedInput;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the bank of Giselle");
        System.out.println("Enter your Pin: ");
        passedInput = keyboard.nextInt();
        pinChecker(pin, passedInput, keyboard);
    }
}
