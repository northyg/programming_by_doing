
// https://programmingbydoing.com/a/asking-questions.html

import java.util.Scanner;

public class AskingQuestions{

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int age;
        String feet;
        String inches;
        double weight;

        System.out.print( "How old are you? " );
        age = keyboard.nextInt();

        System.out.print( "How many feet tall are you? ");
        feet = keyboard.next();

        System.out.print(" And how many inches? ");
        inches = keyboard.next();

        System.out.print( "How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.println( "So you're " + age + " years old, " + feet + "'" + inches + "\"" + "tall and " + weight + " pounds heavy." );
 // WORK DAMN YOU
    }
}
