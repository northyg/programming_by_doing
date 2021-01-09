// https://programmingbydoing.com/a/your-schedule.html
// Your Schedule
// Use several variables to store the names of your classes and their teachers.
// Then, display a nice little table displaying your schedule.
// Just FYI, my column of courses has a width of 26 characters, and the teacher column has a width of 15.
// The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.

// This is borked. Approach doesn't work well for this
// should have put the variables in an array or something instead
// makes it really hard to print the spaces in the sheet right



class YourSchedule{

    public static void printsTheBars(int topBottomBarSize){
        System.out.print("+");
        for(int i = 0; i < topBottomBarSize; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    // Method prints out the schedule
    // I don't like putting all the variables into one function
    // I think it would be better to take in the class and prof. list from something like a .csv file
    // assign to 1 variable for each, so 2 total like String className and String profName
    // then loop through the list and print out the schedule
    public static void printsTheSchedule(String courseOne, String courseTwo, String courseThree, String courseFour, String courseFive, String courseSix, String courseSeven, String courseEight, String teacherOne, String teacherTwo, String teacherThree, String teacherFour, String teacherFive, String teacherSix, String teacherSeven, String teacherEight) {
       //int courseOneLength = courseOne.length() - classPadding;
      //  int padding = 0;
      //  Math.abs(padding) = classPadding - courseOne.length();
       // System.out.println(courseOneLength);
      //  System.out.println(padding);
        System.out.print("| " + "1" + " |    " + courseOne + " | " + teacherOne + " \n");
        System.out.print("| " + "2" + " |    " + courseTwo + " | " + teacherTwo + " \n");
        System.out.print("| " + "3" + " |    " + courseThree + " | " + teacherThree + " \n");
        System.out.print("| " + "4" + " |    " + courseFour + " | " + teacherFour + " \n");
        System.out.print("| " + "5" + " |    " + courseFive + " | " + teacherFive + " \n");
        System.out.print("| " + "6" + " |    " + courseSix + " | " + teacherSix + " \n");
        System.out.print("| " + "7" + " |    " + courseSeven + " | " + teacherSeven + " \n");
        System.out.print("| " + "8" + " |    " + courseEight + " | " + teacherEight + " \n");
    }
/*
    public static void calculateTotalClassPadding(String courseOne, String courseTwo, String courseThree, String courseFour, String courseFive, String courseSix, String courseSeven, String courseEight){
        int[] padding = 0;
        int[] p = new int[a];
        for(int i = 0; i < 8; ++i){
            padding = classPadding - courseOne.length()
        }
    }

 */

/*
    // Method prints the class padding
    public static void printClassPadding(int classPadding, String courseOne){
        int padding = 0;
        padding = classPadding - courseOne.length();
        System.out.print("|");
        for(int i = 0; i < Math.abs(padding); ++i){
            System.out.print(" ");
        }
        System.out.println("|");
    }

 */

    public static void main(String args[]){

        String courseOne = "English III";
        String courseTwo = "PreCalculus";
        String courseThree = "Music Theory";
        String courseFour = "Biotechnology";
        String courseFive = "Principles of Technology I";
        String courseSix = "Latin II";
        String courseSeven = "AP US History";
        String courseEight = "Business Computer Information Systems";

        String teacherOne = "Ms. Lapan";
        String teacherTwo = "Mrs. Gideon";
        String teacherThree = "Mr. Davis";
        String teacherFour = "Ms. Palmer";
        String teacherFive = "Ms. Garcia";
        String teacherSix = "Mrs. Barnett";
        String teacherSeven = "Ms. Johannessen";
        String teacherEight = "Mr. James";

        int topBottomBarSize = 60;
        //int numberOfLines = 8;
       // int classPadding = 40;
       // int teacherPadding = 20;

        /*
        for(int i = 0; i < numberOfLines; ++i){
            printsTheBars(topBottomBarSize);
        }
         */
       // printClassPadding(classPadding, courseOne);
        printsTheBars(topBottomBarSize);
        printsTheSchedule(courseOne, courseTwo, courseThree, courseFour, courseFive, courseSix, courseSeven, courseEight, teacherOne, teacherTwo, teacherThree, teacherFour, teacherFive, teacherSix, teacherSeven, teacherEight);
        printsTheBars(topBottomBarSize);
    }
}