package cw33;

import java.util.*;

public class allTargerInArrlist {
    static ArrayList<Integer> allTargerInAr(int[] a, int n, int target, int idx) {
        if (idx >= n) {
            return new ArrayList<Integer>();// return empty arraylist

        }
        ArrayList<Integer> ans = new ArrayList<>();
        // self work

        if (a[idx] == target) {
            ans.add(idx);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        int n = a.length;
        ArrayList<Integer> ans = allTargerInAr(a, n, target, n);
        for (Integer i : ans) {
            System.out.println(i);
        }
        System.out.println("bye!");
    }
}