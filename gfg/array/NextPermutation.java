package array;

import java.util.Arrays;

public class NextPermutation {
    public static int solution(int[] arr) {
        Arrays.stream(arr);
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 3 };
        // Arrays.stream(arr);
        Arrays.stream(arr).forEach(e->System.out.print(e+" "));
        // Arrays.stream(arr).forEach(System.out.println(arr));
    }
}
// Arrays.stream(arr).forEach(set::add); ==
// for (int num : arr) { // Loop through each element in the array
// set.add(num); // Add the current element to the set
// }
