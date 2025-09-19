import java.util.*;
import java.lang.*;
import java.io.*;

class BearandCandies123 {
    class Codechef {
        public static void main(String[] args) throws java.lang.Exception {
            // your code goes here
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            while (t-- > 0) {
                int a = s.nextInt();
                int b = s.nextInt();
                int i = 1;
                while (a >= 0 || b >= 0) {
                    if (i % 2 != 0) {
                        a -= i;
                        i++;
                        if (a < 0) {
                            System.out.println("Bob");
                            break;
                        }
                    } else {
                        b -= i;
                        i++;
                        if (b < 0) {
                            System.out.println("Limak");
                            break;
                        }
                    }
                }

            }

        }
    }
}