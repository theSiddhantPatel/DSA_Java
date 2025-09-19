package striverDsaNotion.array;

import java.util.*;

public class mergeIntervals56 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n <= 1)
            return intervals;
        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        res.add(intervals[0]);
        // interval based problem-> sort it on the basis of starting point and end
        // point
        for (int i = 1; i < n; i++) {
            int[] last = res.get(res.size() - 1);

            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(int[][]::new);
        // int[][]::new tells Java:
        // ➡️ "Create an array of type int[][] with the right size."
        // or you can write->
        // return res.toArray(new int[res.size()][]);
        /*
         * Equivalent to:
         * int[][] result = new int[res.size()][];
         * for (int i = 0; i < res.size(); i++) {
         * result[i] = res.get(i);
         * }
         */
    }


    public int[][] merge2(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Step 1: Sort intervals by their starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]); // Add the first interval

        // Step 2: Iterate and merge overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] last = res.get(res.size() - 1); // Last interval in the result

            if (intervals[i][0] <= last[1]) {
                // Overlapping — merge
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                // No overlap — add new interval
                res.add(intervals[i]);
            }
        }

        // Step 3: Convert result list to array
        return res.toArray(new int[res.size()][]);
    }

    // the above question is a part of this question leetcode 3394

    public boolean checkValidCuts(int n, int[][] rectangles) {
        
        return true;
    }

    public static void main(String[] args) {

    }
}
