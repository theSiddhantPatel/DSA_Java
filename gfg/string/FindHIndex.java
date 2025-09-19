package string;

import java.util.Collections;
import java.util.Arrays;

public class FindHIndex {
    // Function to find hIndex
    public static int hIndex(int[] citations) {
        // code here
        Integer[] integerArray = new Integer[citations.length]; // typecasting int to Integer for using builtin reverse
                                                                // function
        for (int i = 0; i < citations.length; i++) {
            integerArray[i] = citations[i]; // Autoboxing from int to Integer
        }
        Arrays.sort(integerArray, Collections.reverseOrder());
        // for (Integer integer : integerArray) {
        // System.out.print(integer + " ");
        // }
        // System.out.println();
        int count = 0;
        // while (integerArray[j] >= j + 1 && j < integerArray.length) {
        // //you can use only count var in place of j
        // count++;
        // j++;
        // }
        while (integerArray[count] >= count + 1 && count < integerArray.length) {
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5,0,3,3,0};
        System.out.println(hIndex(arr));
    }
}
