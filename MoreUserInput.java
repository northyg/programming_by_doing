/*
https://programmingbydoing.com/a/more-user-input-of-data.html
Ask the user for several pieces of information, and display them on the screen afterward as a summary.

first name
last name
grade (classification)
student id number
login name
GPA (0.0 to 4.0)
You must use the most appropriate type for each variable and not just Strings for everything.

 */
import java.util.*;

class MoreUserInput {

    public static void getName(String firstName, String lastName){
        System.out.println("\tName: " + lastName + ", " + firstName);
    }

    public static void getGrade(int grade){
        System.out.println("\tGrade: " + grade);
    }

    public static void getStudentId(int studentId){
        System.out.println("\tID: " + studentId);
    }

    public static void getLoginName(String loginName){
        System.out.println("\tLogin: " + loginName);
    }

    public static void getGpa(double gpa){
        System.out.println("\tGPA: " + gpa);
    }
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String lastName;
        int grade;
        int studentId;
        String loginName;
        double gpa;

        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.print("First name: ");
            firstName = keyboard.next();
        System.out.print("Last name: ");
            lastName = keyboard.next();
        System.out.print("Grade (9-12): ");
            grade = keyboard.nextInt();
        System.out.print("Student ID: ");
            studentId = keyboard.nextInt();
        System.out.print("Login: ");
            loginName = keyboard.next();
        System.out.print("GPA (0.0-4.0): ");
            gpa = keyboard.nextDouble();

        System.out.println("Your information:");
        getName(firstName, lastName);
        getGrade(grade);
        getStudentId(studentId);
        getLoginName(loginName);
        getGpa(gpa);
    }
}
