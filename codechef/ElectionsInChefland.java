import java.util.*;
import java.lang.*;
import java.io.*;

public class ElectionsInChefland {

    class Codechef {
        public static void main(String[] args) throws java.lang.Exception {
            // your code goes here
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();

            while (t-- > 0) {
                int x1 = s.nextInt();
                int x2 = s.nextInt();
                int x3 = s.nextInt();
                // if((x1+x1+x3)!=101) break;
                if (x1 >= 51 && x2 + x3 <= 50)
                    System.out.println("A");
                else if (x2 >= 51 && x1 + x3 <= 50)
                    System.out.println("B");
                else if (x3 >= 51 && x1 + x2 <= 50)
                    System.out.println("C");
                else
                    System.out.println("NOTA");

            }

        }
    }

}
