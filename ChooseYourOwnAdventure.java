/*
http://programmingbydoing.com/a/choose-your-own-short-adventure.html
Make a short "Choose Your Own Adventure" game. The starting room should give the user two choices.
Then the second room they travel to should give them two more choices. Finally the third room should
give them two choices.

This means your game will have eight possible "endings". Your game will also have a total of
fifteen rooms:

        _ R1 _
       /      \
    R2          R3
   /  \        /  \
 R4    R5    R6    R7
 /\    /\    /\    /\
E1 E2 E3 E4 E5 E6 E7 E8
You must use nested if statements to do this.
 */

import java.util.*;

class ChooseYourOwnAdventure {

    public static void runAdventure() {
        String input;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Giselle's text Based Adventure Happy fun time!\nI was too lazy to fill this out so enjoy some if statements\nPick room R2 or R3");
        input = keyboard.nextLine();

        // R2 track
        if (input.equals("R2")) {
            System.out.println("Pick either R4 or R5");
            input = keyboard.nextLine();
            if (input.equals("R4")) {
                System.out.println("Pick either E1 or E2");
                input = keyboard.nextLine();
                if (input.equals("E1")) {
                    System.out.println("Say E1 stuff"); // brand 1 last "room"
                }
                if (input.equals("E2")) {
                    System.out.println("say E2 stuff"); // other last "room"
                }
            }

            if (input.equals("R5")) {
                System.out.println("Pick either E3 or E4");
                input = keyboard.nextLine();
                if (input.equals("E3")) {
                    System.out.println("Say E3 stuff"); // branch 2 last room
                }
                if (input.equals("E4")) {
                    System.out.println("Say E4 stuff"); // branch 2
                }
            }
        }

        // R3 track
        if (input.equals("R3")) {
            System.out.println("Pick either R6 or R7");
            input = keyboard.nextLine();
            if (input.equals("R6")) {
                System.out.println("Pick either E5 or E6");
                input = keyboard.nextLine();
                if (input.equals("E5")) {
                    System.out.println("Say E5 stuff");
                }
                if (input.equals("E6")) {
                    System.out.println("Say E6 stuff");
                }
            }

            if (input.equals("R7")) {
                System.out.println("Pick either E7 or E8");
                input = keyboard.nextLine();
                if (input.equals("E7")) {
                    System.out.println("Say E7 stuff");
                }
                if (input.equals("E8")) {
                    System.out.println("Say E8 stuff");
                }
            }
        }
    }

    public static void main(String[] args) {
        runAdventure();
    }
}
