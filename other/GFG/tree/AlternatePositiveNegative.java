package tree;
// // Alternate positive and negative numbers
// public class alternateArray {
// public static void main(String[] args) {
//     int []arr={1,-2,-3,-4,5,67,8}
// }
// }
import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-5,1, -2, 3, -4, 5, -6, 7, -8, 9,10};
        int[] result = alternatePosNeg(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] alternatePosNeg(int[] arr) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int[] result = new int[arr.length];
        int posIndex = 0, negIndex = 0, index = 0;

        // Alternate positive and negative numbers
        while (posIndex < positive.size() && negIndex < negative.size()) {
            result[index++] = positive.get(posIndex++);
            result[index++] = negative.get(negIndex++);
        }

        // Add remaining positive numbers
        while (posIndex < positive.size()) {
            result[index++] = positive.get(posIndex++);
        }

        // Add remaining negative numbers
        while (negIndex < negative.size()) {
            result[index++] = negative.get(negIndex++);
        }

        return result;
    }
}
