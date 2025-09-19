import java.util.Scanner;

//https://codeforces.com/problemset/problem/58/A
public class ChatRoom {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str2 = "hello";
        for (int i = 0, j = 0; i < str.length() && j < str2.length(); i++) {
            if (str.charAt(i) == str2.charAt(j)) {
                sb.append(str.charAt(i));
                j++;
            }
        }
        sb.toString();
        System.out.println(sb.length() == str2.length() ? "YES" : "NO");
        s.close();
    }
}
