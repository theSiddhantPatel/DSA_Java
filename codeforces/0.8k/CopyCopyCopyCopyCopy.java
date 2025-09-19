import java.util.Arrays;
import java.util.Scanner;

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] != arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}

// Use a Set for Counting Unique Elements: Instead of sorting the array and then
// counting unique elements, you can directly use a HashSet to count unique
// elements. This will reduce the time complexity from
// O(nlogn)(due to sorting)
/*
 * You cannot create a HashMap without a key because it is a key-value data
 * structure.
 *
 * If you only need to store unique values without keys, use a HashSet.
 *
 * If you need to associate values with keys, use a HashMap.
 *
 * 
 */

// import java.util.*;

// public class CopyCopyCopyCopyCopy {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// int t = s.nextInt();
// while (t-- > 0) {
// int n = s.nextInt();
// Set<Integer> uniqueElements = new HashSet<>();
// for (int i = 0; i < n; i++) {
// uniqueElements.add(s.nextInt());
// }
// System.out.println(uniqueElements.size());
// }
// s.close();
// }
// }
