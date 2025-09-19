import java.util.Scanner;
//https://codeforces.com/problemset/problem/118/A
public class StringTask {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        String vowels = "aeiouy";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                // Check if the character is not a vowel
                sb.append('.');
                sb.append(c);
            }

        }
        System.out.println(sb.toString());

        s.close();
    }
}
