package cw17;

import java.util.ArrayList;
// import java.util.Scanner;
//leetcode 3159 

// create a frequency array size of 100000
public class frequencyArray {
    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        // Step 1: Collect all indices where nums[i] == x
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                list.add(i);
            }
        }
        // Step 2: Process each query
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int k = queries[i];
            if (k > list.size())
                result[i] = -1;
            else
                result[i] = list.get(k - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] queries = { 10 };
        int x = 5;
        System.out.println(occurrencesOfElement(nums, queries, x));
    }
}
