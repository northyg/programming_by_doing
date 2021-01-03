// https://programmingbydoing.com/a/your-initials.html
// Print your initials to stdout
// I put the initials in a txt file, then read out the file

import java.io.*;
import java.util.*;

public class YourInitials{

    public static void main (String[] args) throws Exception{

        File file = new File("initials.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
