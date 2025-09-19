package string;

import java.util.*;

public class Anagram {
    public static boolean solution(String a, String b) {
        char[] charArray = a.toCharArray();
        Arrays.sort(charArray);
        String sortedString1 = new String(charArray);
        char[] charArray2 = b.toCharArray();
        Arrays.sort(charArray2);
        String sortedString2 = new String(charArray2);
        if (sortedString1.length() != sortedString2.length()) {
            return false;
        }
        for (int i = 0; i < sortedString1.length(); i++) {
            if (sortedString1.charAt(i) != sortedString2.charAt(i)) {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        System.out.println(solution(s1, s2));
        s.close();
    }
}
