import java.util.Scanner;

//https://codeforces.com/problemset/problem/59/A
public class Word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int COUNT = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - 96 < 0) {
                COUNT++;
            } else
                count++;
        }
        System.out.println(COUNT > count ? str.toUpperCase() : str.toLowerCase());
        s.close();
    }
}
