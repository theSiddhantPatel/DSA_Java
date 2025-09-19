package cw52llInterviewQues;

import java.util.Arrays;

public class Solution {
    public int calculateSum(int[] arr) {
        // code here
        int n=arr.length;
        int score=0;
        Arrays.sort(arr);
        // int i=0;j=n-1;
        // while (i<=j) {
        //     sum+
        // }
        for(int i=0;i<n-1;i+=2){
            score+=Math.abs(arr[i]-arr[i+1]);
        }
        return score;

    }
    public static void main(String[] args) {
        System.out.println(":hello");
    }
}
