/*
http://programmingbydoing.com/a/space-boxing.html
Space Boxing
Julio Cesar Chavez Mark VII is an interplanetary space boxer, who currently holds the championship belts for various
weight categories on many different planets within our solar system. However, it is often difficult for him to recall
 what his "target weight" needs to be on earth in order to make the weight class on other planets. Write a program
  to help him keep track of this.

It should ask him what his earth weight is, and to enter a number for the planet he wants to fight on.
It should then compute his weight on the destination planet based on the table below:

#	Planet	Relative gravity
1	Venus	0.78
2	Mars	0.39
3	Jupiter	2.65
4	Saturn	1.17
5	Uranus	1.05
6	Neptune	1.23

 */
import java.util.*;

class SpaceBoxing {

    public static double computesPounds(double weight, int planet){
        if(planet == 1){
            weight = weight * 0.78;
        }
        else if(planet == 2){
            weight = weight * 0.39;
        }
        else if(planet == 3){
            weight = weight * 2.65;
        }
        else if(planet == 4){
            weight = weight * 1.17;
        }
        else if(planet == 5){
            weight = weight * 1.05;
        }
        else if(planet == 6){
            weight = weight * 1.23;
        }
        else{
            System.out.print("Wrong input");
        }
        return weight;
    }

    public static void main(String[] args) {

        double weight;
        int planet; // planet selection #

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your current earth weight in pounds: ");
        weight = keyboard.nextDouble();

        System.out.println("I have information for the following planets: ");
        System.out.println("\t1. Venus\t 2. Mars\t 3. Jupiter\n\t4. Saturn\t 5. Uranus\t 6. Neptune");

        System.out.println("Which planet are you visiting? ");
        planet = keyboard.nextInt();
        if(planet < 1 || planet > 6){
            System.out.println("Wrong input! Select 1 - 6 only");
        }
        else{
            weight = computesPounds(weight, planet);
            System.out.println("Your weight would be " + weight + " pounds on that planet.");
        }
    }
}
