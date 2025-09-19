package contest;
import java.util.HashMap;
import java.util.Map;

public class pairCount{

    // https://practice.geeksforgeeks.org/contest/gfg-weekly-194-rated-contest/problems

    // Function to compute the complement of a given number.
    public static  int compNumber(int num) {
        String s = String.valueOf(num);
        StringBuilder complement = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            // Replace each digit 'd' with its
            // complement (9 - d)
            complement.append((char) ('9' - s.charAt(i) + '0'));
        }

        // Convert the modified string back to an integer
        // (removes leading zeros)
        return Integer.parseInt(complement.toString());
    }

    public static long countPairs(int[] arr) {

        // HashMap to store frequency of numbers
        Map<Integer, Integer> m = new HashMap<>();
        long res = 0;

        for (int num : arr) {

            // Check how many times the complement
            // of num has appeared before
            res += m.getOrDefault(compNumber(num), 0);

            // Store the current number in the HashMap
            // for future comparisons
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[]={1 ,2, 3 ,4, 5};
        System.out.println(countPairs(arr));

    }
}
