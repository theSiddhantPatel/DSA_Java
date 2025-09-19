package cw17;

import java.util.Scanner;

// create a frequency array size of 100000
public class frequencyArray {
    public static int[] array(int[] arr, int n) {
        int[] freq = new int[100010];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 3, 5, 1 };
        int n = arr.length;
        array(arr, n);
        int freq[]=
        System.out.println("enter number of queries");
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        while (q > 0) {
            System.out.println("enter number to be searched");
            int x = s.nextInt();
            if (freq[x] > 0) {
                System.out.println("yes");
            } else
                System.out.println("no");
            q--;
        }
    }
}
