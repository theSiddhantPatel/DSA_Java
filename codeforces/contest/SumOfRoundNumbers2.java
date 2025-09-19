package codeforces.contest;

import java.util.*;

public class SumOfRoundNumbers2 {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> rounds = new ArrayList<>();
        int[] v = { 10, 100, 1000, 10000, 100000 };
        for (int i = 0; i < v.length; i++) {
            if (n % v[i] != 0) {
                rounds.add(n % v[i]);
                n -= n % v[i];
            }
        }
        System.out.println(rounds.size());
        for (int val : rounds) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}
