import java.util.Scanner;

@SuppressWarnings("resource")

public class q8PetyaAndStrings {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.equals(str2)) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            // char c1 = Character.toLowerCase(str1.charAt(i));
            // I have already done it at the time of string input;
            // char c2 = Character.toLowerCase(str2.charAt(i));
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 == c2) {
                continue;
            } else if (c1 > c2) {
                System.out.println(1);
                return;
            } else
                System.out.println(-1);
            return;
        }
    }
}

// // if (str1.equalsIgnoreCase(str2)) { // for this go to ms 1note

// System.out.println(0);
// // continue;
// return;
// }
// // else while((str1.toLowerCase()).equals(str2.toLowerCase())){
// else