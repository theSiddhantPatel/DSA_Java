package String;

import java.util.Scanner;

public class ZeroString {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String str = s.next();
            if (str.length() != n)
                break;
            int count0 = 0, count1 = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0')
                    count0++;
                else
                    count1++;
            }
            if (count0 >= count1)
                System.out.println(count1);
            else
                System.out.println(count0 + 1);
        }

    }
}
