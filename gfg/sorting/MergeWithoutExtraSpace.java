package sorting;

import java.util.Arrays;

/*
Given two sorted arrays a[] and b[] of size n and m respectively,
 the task is to merge them in sorted order without using any extra space.
  Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.
 * Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
2 2 3 4
7 10
Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output:
1 2 3 5 8 9
10 13 15 20
Explanation: After merging two sorted arrays we get 1 2 3 5 8 9 10 13 15 20.
Input: a[] = [0, 1], b[] = [2, 3]
Output:
0 1
2 3
Explanation: After merging two sorted arrays we get 0 1 2 3.
 */
public class MergeWithoutExtraSpace {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length - 1, m = 0;
        while (m < b.length && n >= 0 && a[n] > b[m]) { // This order ensures that the indices are always valid before
                                                        // the comparison
            int temp = a[n];
            a[n] = b[m];
            b[m] = temp;
            n--;
            m++;
        }
        Arrays.sort(a);
        Arrays.sort(b);

    }
}
/*
 * chatgpt
 * public void mergeArrays(int a[], int b[]) {
 * // code here
 * int n=a.length-1,m=0;
 * while ( m<b.length && n>=0 && a[n]>b[m]){
 * int temp=a[n];
 * a[n]=b[m];
 * b[m]=temp;
 * n--;
 * m++;
 * }
 * Arrays.sort(a);
 * Arrays.sort(b);
 * 
 * }
 * }
 * Query this code is related to swap an array without using extra space, tell
 * me
 * why is it giving wrong answer if i shuffle while loop condition like while (
 * a[n]>b[m]&& n>=0 &&m<b.length )
 * ChatGPT said:
 * ChatGPT
 * The issue with changing the condition in the while loop lies in how Java
 * evaluates boolean expressions with &&. The evaluation is short-circuiting,
 * meaning it evaluates from left to right and stops as soon as a condition
 * evaluates to false. This subtle detail changes the behavior of the loop
 * significantly when the order of conditions is modified.
 * 
 * Current Code (while (m < b.length && n >= 0 && a[n] > b[m]))
 * First Condition (m < b.length): Ensures you don't access an invalid index in
 * b. This is checked first, which is safe because b[m] is accessed in the loop
 * body.
 * Second Condition (n >= 0): Ensures you don't access an invalid index in a.
 * This is checked second, ensuring that a[n] exists when you perform
 * comparisons.
 * Third Condition (a[n] > b[m]): This is the actual comparison and swap
 * condition.
 * This order ensures that the indices are always valid before the comparison
 * (a[n] > b[m]).
 * 
 * Modified Code (while (a[n] > b[m] && n >= 0 && m < b.length))
 * First Condition (a[n] > b[m]): This is evaluated before ensuring that n >= 0
 * and m < b.length.
 * If n is -1 or m exceeds b.length - 1, the program might still try to access
 * a[n] or b[m], leading to an ArrayIndexOutOfBoundsException.
 * Short-circuiting does not help here because you're trying to access array
 * elements before confirming their indices are valid.
 * Example of Failure
 * For arrays a = [7, 9] and b = [3, 6]:
 * 
 * Current Code:
 * 
 * The loop checks m < b.length first, ensuring b[m] exists.
 * Then it checks n >= 0 to ensure a[n] exists.
 * Finally, it performs the comparison and swaps if necessary. This works as
 * intended.
 * Modified Code:
 * 
 * The loop checks a[n] > b[m] first, even if n < 0 or m >= b.length. If either
 * index is invalid, it crashes.
 * Solution
 * Always ensure that index bounds (n >= 0, m < b.length) are checked before
 * accessing array elements in the loop condition. Stick to the original order:
 * 
 * java
 * Copy code
 * while (m < b.length && n >= 0 && a[n] > b[m]) {
 * int temp = a[n];
 * a[n] = b[m];
 * b[m] = temp;
 * n--;
 * m++;
 * }
 * This ensures safety and correctness of the logic.
 * 
 * 
 * 
 * 
 * 
 * 
 */
