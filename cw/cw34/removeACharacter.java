package cw34;

// import java.util.Scanner;

public class removeACharacter {
    // remove all the occurrences of "a" from string s="abcax"
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        String s = "abcax";
        String ans = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                ans += s.charAt(i);
            }
        }
        System.out.print(ans);
      
    }
}