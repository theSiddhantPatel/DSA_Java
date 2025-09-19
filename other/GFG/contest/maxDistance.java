package contest;

import java.util.Scanner;

class maxDistance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 5, 1, 6, 2, 3, 4 };
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        while (arr[i] != n) {
            i++;
        }
        int loc1 = i;
        int loc2 = 1;
        for (int j = loc1 + 1; j < arr.length; j++) {
            if (arr[j] == n) {
                loc2 = j;
                System.out.print(loc2 + " ");

            }
            // loc2=j;
        }
        int distance = loc2 - loc1;
        System.out.println(loc2);
        System.out.println(loc1);
        System.out.println(distance);
        s.close();
    }
}

/*
 * Given an array arr[] with repeated elements, the task is to find the maximum
 * distance between two occurrences of an element.
 * 
 * Note: You may assume that every input array has repetitions.
 * 
 * Examples:
 * 
 * Input: arr = [1, 1, 2, 2, 2, 1]
 * Output: 5
 * Explanation: distance for 1 is: 5-0 = 5, distance for 2 is : 4-2 = 2, So max
 * distance is 5.
 * Input: arr = [3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2]
 * Output: 10
 * Explanation: maximum distance for 2 is 11-1 = 10, maximum distance for 1 is
 * 4-2 = 2 ,maximum distance for 4 is 10-5 = 5, So max distance is 10.
 * Expected Time Complexity : O(n)
 * Expected Auxilliary Space : O(n)
 * 
 * Constraints:
 * 1 <= arr.size() <= 106
 * 1 <= arr[i] <= 109
 * 
 * 
 */