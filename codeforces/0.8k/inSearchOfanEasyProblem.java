import java.util.Scanner;
//https://codeforces.com/problemset/problem/1030/A
public class inSearchOfanEasyProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            max = Math.max(max, a);

        }
        System.out.println(max > 0 ? "Hard" : "Easy");
        s.close();
    }
}
