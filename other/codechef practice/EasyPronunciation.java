import java.util.*;


// class Codechef {
//     public static void main(String[] args) throws java.lang.Exception {
//         // your code goes here
//         Scanner s = new Scanner(System.in);
//         int t = s.nextInt();
//         while (t > 0) {
//             int n = s.nextInt();
//             String sw = s.next();
//             if (sw.length() == n) {

//                 int count = 0;
//                 for (int i = 0; i < n; i++) {
//                     if (sw.charAt(i) == 'a' || sw.charAt(i) == 'e' || sw.charAt(i) == 'i' || sw.charAt(i) == 'o'
//                             || sw.charAt(i) == 'u') {
//                         count = 0;
//                         // System.out.println(a);
//                     } else
//                         count++;
//                     if (count == 5) {
//                         System.out.println("NO");
//                         return;
//                     }
//                 }
//                 System.out.println("yes");
//             } else
//             return;
//             t--;
//         }

//     }
// }
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            String sw = s.next();
            if (sw.length() == n) {


                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (sw.charAt(i) == 'a' || sw.charAt(i) == 'e' || sw.charAt(i) == 'i' || sw.charAt(i) == 'o' ||
                        sw.charAt(i) == 'u') {
                        count = 0;
                        // System.out.println(a);
                    } else
                        count++;
                    if (count == 5) {
                        System.out.println("NO");
                        break;
                    }

                }
                if (count!=5) {
                    
                    System.out.println("Yes");
                }
            }
            else return;
            t--;
            
        }

    }
}