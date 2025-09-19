import java.util.Scanner;

//https://codeforces.com/problemset/problem/41/A
public class Translation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str2 = s.next();
        int j = str.length() - 1, flag = 0;
        if (str.length() != str2.length()) {
            System.out.println("NO");

        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str2.charAt(j)) {
                    j--;
                } else {
                    flag = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if (flag == 0)
                System.out.println("YES");
        }
        s.close();
    }
}
