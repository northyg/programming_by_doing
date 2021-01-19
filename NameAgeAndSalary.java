/*
https://programmingbydoing.com/a/name-age-and-salary.html

Ask the user for their name.
Then display their name to prove that you can recall it.
Ask them for their age. Then display that.
Finally, ask them for how much they make and display that.
You should use the most appropriate data type for each variable.
 */
import java.util.Scanner;

class NameAgeAndSalary {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        Double pay;

        System.out.println("Hello. What is your name?");
        name = keyboard.next();

        System.out.println("Hi " + name + "! How old are you?");
        age = keyboard.nextInt();
        if(age > 40){
            System.out.println("So you're" + age + " You old foogy you!");
        }
        else{
            System.out.println("So you're " + age + " You youngin' you!");
        }
        
        System.out.println("How much do you make, " + name + "?");
        pay = keyboard.nextDouble();

        System.out.println(pay + "! I hope that's per hour and not per year! LOL!");
    }
}
