/*
https://programmingbydoing.com/a/age-in-five-years.html

Hello.  What is your name? Percy_Bysshe_Shelley

Hi, Percy_Bysshe_Shelley!  How old are you? 34

Did you know that in five years you will be 39 years old?
And five years ago you were 29! Imagine that!
 */
import java.lang.Math;
import java.util.*;

class AgeInFiveYears {

    // Method subtracts the age by numToSubtract.
    // If number is less than 0, then person wasn't born yet.
    public static int subtractAge(int age, int numToSubtract){
        int newAge = age - numToSubtract;
        if(newAge < 0){
            newAge = 0;
            System.out.println("Wow! " + numToSubtract + " years ago you weren't born yet! ");
        }
        else{
            System.out.println("Did you know that " + numToSubtract + " years ago you were " + newAge + "! Imagine that!");
        }
        return newAge;
    }

    // Method adds the age by numToAdd
    public static int addAge(int age, int numToAdd){
        int newAddedAge = age + numToAdd;
        System.out.println("And " + numToAdd + " years from now you will be " + newAddedAge + "?");
        return newAddedAge;
    }

    public static void main(String[] args) {

        String name;
        int age = 0;
        int numToSubtract = 5;
        int numToAdd = 5;
        Scanner keyboard = new Scanner(System.in);


        // SAY STUFF TO PERSON and GET INPUTS FOR VARIABLES
        System.out.print("Hello, what is your name? ");
            name = keyboard.next();
        System.out.print("Hi " + name + "! How old are you? ");
            age = keyboard.nextInt();
        subtractAge(age, numToSubtract);
        //System.out.println("This is the new age" + newAge);
        addAge(age, numToAdd);
    }
}
