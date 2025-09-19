import java.util.*;
import java.lang.*;
import java.io.*;

public class ChefandTwoStrings {

    // class Codechef
    // {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String s1 = s.next();
            String s2 = s.next();
            int max = 0;
            int min = s2.length();
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i) || (s1.charAt(i) == '?' && s2.charAt(i) == '?')) {
                    max++;
                }
                if (s1.charAt(i) == s2.charAt(i) || s1.charAt(i) == '?' || s2.charAt(i) == '?') {
                    min--;
                }
            }
            System.out.println(min + " " + max);

        }

    }
}
// }
 