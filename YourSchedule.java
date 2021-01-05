// https://programmingbydoing.com/a/your-schedule.html
// Your Schedule
// Use several variables to store the names of your classes and their teachers.
// Then, display a nice little table displaying your schedule.
// Just FYI, my column of courses has a width of 26 characters, and the teacher column has a width of 15.
// The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.

class YourSchedule{

    public static void printsTheBars(int topBottomBarSize){
        System.out.print("+");
        for(int i = 0; i < topBottomBarSize; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void printsTheSchedule(int numberOfLines, String courseOne){
        for(int i = 0; i < numberOfLines; ++i){
            System.out.print("| " + i + " | " + courseOne + " | \n");
        }
    }

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
        int numberOfLines = 8;

        for(int i = 0; i < numberOfLines; ++i){
            printsTheBars(topBottomBarSize);
        }
        printsTheSchedule(numberOfLines, courseOne);
    }
}