package array;

import java.util.Arrays;
//https://chatgpt.com/share/677d90ca-e894-8000-8124-896a50f15f8d
class CountTheNumberOfPossibleTriangles {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 0, n = arr.length;
        // if(n<3) return 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k])
                        count++;
                }
            }
        }
        return count;
    }

    // (This is a n3 solution to reduce T.C. we will use 2 pointer approach)
    // import java.util.Arrays;

    class Solution {
        // Function to count the number of possible triangles.
        static int countTriangles1(int arr[]) {
            Arrays.sort(arr);
            int n = arr.length;
            int count = 0;

            // Fix the third side as the largest element.
            for (int k = n - 1; k >= 2; k--) {
                int i = 0; // Start pointer
                int j = k - 1; // End pointer

                while (i < j) {
                    // Check if the sum of arr[i] and arr[j] is greater than arr[k].
                    if (arr[i] + arr[j] > arr[k]) {
                        // All pairs between i and j are valid.
                        count += (j - i);
                        j--; // Decrease j to check for other pairs.
                    } else {
                        i++; // Increase i to make the sum larger.
                    }
                }
            }
            System.out.println("Hello");
            return count;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, 7 };
        System.out.println("Number of triangles: " + countTriangles(arr));
    }

}