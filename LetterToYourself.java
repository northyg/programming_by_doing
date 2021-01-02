// https://programmingbydoing.com/a/letter-to-yourself.html

public class LetterToYourself
{
    // Method sets top print statement
    public static void setTop(Integer numPassed) {
        System.out.print("+");
        for (int i = 0; i < numPassed; ++i) {
            System.out.print("-");
        }
        System.out.print("+" + "\n");
    }

    // Method sets the bottom print statement
    public static void setBottom(Integer numPassed) {
        System.out.print("+");
        for (int i = 0; i < numPassed; ++i) {
            System.out.print("-");
        }
        System.out.print("+" + "\n");
    }

    // Method sets the sides of print statement
    public static void setSides(Integer numPassed) {
        System.out.print("+");
        for (int i = 0; i < numPassed; ++i) {
            System.out.print("-");
        }
        System.out.print("+" + "\n");
    }

    //Method sets print for Stamp
    public static void setStamp(Integer stampPassed, Integer stampHeightPassed) {
        for (int j = 0; j < stampHeightPassed; ++j) {
            System.out.print("|");
            for (int i = 0; i < stampPassed; ++i) {
                System.out.print(" ");
            }
            System.out.print("####|" + "\n");
        }
    }

    // Method sets print AFTER stamp
   public static void setSidesAfterStamp(Integer setSidesAfterStamp) {
       for (int j = 0; j < 4; ++j) {
           System.out.print("|");
           for (int i = 0; i < setSidesAfterStamp; ++i) {
               System.out.print(" ");
           }
           System.out.print("|" + "\n");
       }
   }

    // Method prints Address First Line
   public static void setAddressLineOne(Integer numberForTop, Integer addressLeftOffset, Integer rightOffset, String addyLineOne) {
       System.out.print("|");
       for (int i = 0; i < addressLeftOffset; ++i) {
           System.out.print(" ");
       }
       System.out.print(addyLineOne);
       rightOffset = numberForTop - addyLineOne.length() - addressLeftOffset;
       // System.out.print("Current right offset" + Math.abs(rightOffset));
       for (int j = 0; j < Math.abs(rightOffset); ++j) {
           System.out.print(" ");
       }
       System.out.println("|");
   }

       // Method prints Address Second Line
       public static void setAddressLineTwo(Integer numberForTop, Integer addressLeftOffset, Integer rightOffset, String addyLineTwo) {
           System.out.print("|");
           for (int i = 0; i < addressLeftOffset; ++i) {
               System.out.print(" ");
           }
           System.out.print(addyLineTwo);
           rightOffset = numberForTop - addyLineTwo.length() - addressLeftOffset;
           // System.out.print("Current right offset" + Math.abs(rightOffset));
           for (int j = 0; j < Math.abs(rightOffset); ++j) {
               System.out.print(" ");
           }
           System.out.println("|");
       }

    // Method prints Address Third Line
    public static void setAddressLineThree(Integer numberForTop, Integer addressLeftOffset, Integer rightOffset, String addyLineThree) {
        System.out.print("|");
        for (int i = 0; i < addressLeftOffset; ++i) {
            System.out.print(" ");
        }
        System.out.print(addyLineThree);
        rightOffset = numberForTop - addyLineThree.length() - addressLeftOffset;
        // System.out.print("Current right offset" + Math.abs(rightOffset));
        for (int j = 0; j < Math.abs(rightOffset); ++j) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
    // Method sets the spacing after the address
    public static void setSpaceAfterAddress(Integer numberForSpaceAfterAddress, Integer numberForTop) {
        for (int j = 0; j < 
             
             
             ; j++) {
            System.out.print("|");
            for (int i = 0; i < numberForTop; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void main ( String[] args ) {

        //INITIALIZE VARIABLES PASSED IN
        int numberForTop = 57;
        int numberForBottom = 57;
        int numberForSpaceAfterStamp = 57;
        int numberForSpaceAfterAddress = 5;
        int numberForStamp = 53;
        int stampHeight = 4;
        int addressLeftOffset = 25;
        int addressRightOffset = 0;
        //int totalAddressLines = 3;
        String addressFirstLine = "Some Person";
        String addressSecondLine = "1234 West St";
        String addressThirdLine = "Portland, Oregon 98765";
        // CALL THE METHODS
        setTop(numberForTop);
        setStamp(numberForStamp, stampHeight);
        setSidesAfterStamp(numberForSpaceAfterStamp);
        setAddressLineOne(numberForTop, addressLeftOffset, addressRightOffset, addressFirstLine);
        setAddressLineTwo(numberForTop, addressLeftOffset, addressRightOffset, addressSecondLine);
        setAddressLineThree(numberForTop, addressLeftOffset, addressRightOffset, addressThirdLine);
        setSpaceAfterAddress(numberForSpaceAfterAddress, numberForTop);
        setBottom(numberForBottom);
    }
}
