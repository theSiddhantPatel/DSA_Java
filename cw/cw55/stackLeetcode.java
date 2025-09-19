//  package cw.cw55;

import java.util.*;

public class stackLeetcode {
    public static void removeConsecutiveSubSequences(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
            i++;
        }
        int[] arr2 = new int[st.size()];
        // Reverse to print in order
        Stack<Integer> reversed = new Stack<>();
        while (!st.isEmpty()) {
            reversed.push(st.pop());
        }
        int j = 0;
        while (!reversed.isEmpty()) {
            int k = reversed.pop();
            arr2[j] = k;
            j++;
        }
        for (int item : arr2) {
            System.out.print(item + " ");
        }
    }

    public static void removeConsecutiveSubSequences2(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
        }
        System.out.println(st);
    }

    public static void nextGreaterElement(int[] arr) {
        // you can solve this problem using array in O(n^2)T.C.,but by using stack you
        // can solve in O(n) T.C.
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek())
                st.pop();
            if (st.isEmpty())
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(arr[i]);
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static void nge(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1;

            while (j < n && arr[j] < arr[i]) {
                j++;
            }
            if (j <= n - 1) {
                st.push(arr[i]);
            } else
                st.push(-1);
        }
        System.out.println(st);
    }

    public static void calculateSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    // public static int largestRectangleArea(int[] heights) {
    // int n = heights.length;
    // Stack<Integer> st = new Stack<>();
    // int[] nse = new int[n]; // next smaller element
    // int[] pse = new int[n]; // previous smaller element
    // // calculate nse
    // st.push(n - 1);
    // for (int i = n - 2; i >= 0; i--) {

    // }

    // }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 8 };
        // removeConsecutiveSubSequences(arr); // Output: 1 2 3 4 5 6
        // int[] arr2 = { 1, 3, 2, 1, 8, 6, 3, 4 };
        // nextGreaterElement(arr2);
        int[] arr3 = { 100, 80, 80, 80, 60, 70, 60, 75, 85 };
        int[] arr4 = { 2, 4 }, arr5 = { 1, 2, 3, 4 };
        nextGreaterElement3(arr4,arr5);
        // calculateSpan(arr3);
        // removeConsecutiveSubSequences2(arr3);
        // nge(arr3);
    }

    public static void nextGreaterElement3(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        st.push(nums2[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && nums2[i] >= st.peek())
                st.pop();
            if (st.isEmpty())
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(nums2[i]);
        }
        int l=nums1.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    nums1[i] = res[j];
                }
            }
        }
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}
