/*
http://programmingbydoing.com/a/a-little-quiz.html
Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something.
It must keep track of how many they get wrong, and print out a "score" at the end.
 */
import java.util.*;

class ALittleQuiz {

    public static int quiz(Scanner keyboard) {
        int correct = 0;
        int answer;

        System.out.println("Q1) What is the capital of Assyria?\n\t1) Assur\n\t2) Metzab \n\t3) Cairo");

        answer = keyboard.nextInt();
        if(answer == 1){
            System.out.println("You're right!");
            ++correct;
        }
        else{
            System.out.println("EEEEAKK WRONG!");
        }

        System.out.println("Q2) What kind of bear is best?\n\t1) Grizzly\n\t2) Black Bear \n\t3) Sun Bear");
        answer = keyboard.nextInt();
        if(answer == 2){
            System.out.println("You're right!");
            ++correct;
        }
        else{
            System.out.println("EEEEAKK WRONG!");
        }

        System.out.println("Q3) What much wood would a wood chuck chuck if a wood chuck could chuck wood?\n\t1) Lots\n\t2) No wood \n\t3) The world may never know");
        answer = keyboard.nextInt();
        if(answer == 3){
            System.out.println("You're right!");
            ++correct;
        }
        else{
            System.out.println("EEEEAKK WRONG!");
        }
        return correct;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String choice;

        System.out.println("Are you ready for a quiz? Y or N");
        choice = keyboard.next();
        if (choice.equals("Y") || choice.equals("y")) {
            int correct = quiz(keyboard);
            System.out.println("You got this many correct! " + correct);
        } else {
            System.out.println("Wrong input. Try again!");
        }
    }
}
