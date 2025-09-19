import java.util.Scanner;

@SuppressWarnings("resource")
public class q10WordCapitalization {
    // https://codeforces.com/problemset/problem/281/A
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));

    }  
}
