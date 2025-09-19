 package GFG160.GFGcontest;

import java.util.*;

public class gfg205Arraygame {
    public static boolean arrayGame(int[] arr) {
        long a = 0, b = 0;
        Arrays.sort(arr); // Sorts in ascending order

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            b += arr[i]; // Bob gets smallest half
        }
        for (int i = n / 2; i < n; i++) {
            a += arr[i]; // Alice gets largest half
        }
        return a > b;
    }

    public static void main(String[] args) {
        int arr[] = { 2,1,1,2};
        System.out.println(arrayGame(arr));
    }
}
