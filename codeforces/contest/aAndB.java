package codeforces.contest;
//https://codeforces.com/contest/2149/problem/D

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class aAndB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Integer> aIndex = new ArrayList<>();
            ArrayList<Integer> bPositions = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a') {
                    aIndex.add(i);
                } else {
                    bPositions.add(i);
                }
            }
            long costA = minCost(aIndex);
            long costB = minCost(bPositions);

            System.out.println(Math.min(costA, costB));
        }
    }

    static long minCost(ArrayList<Integer> positions) {
        int size = positions.size();
        if (size == 0)
            return 0;

        long[] q = new long[size];
        for (int i = 0; i < size; i++) {
            q[i] = positions.get(i) - i;
        }
        Arrays.sort(q);
        long median = q[size / 2];

        long totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += Math.abs(q[i] - median);
        }

        return totalCost;
    }

}
