//1726. Tuple with Same Product
// https://chat.deepseek.com/a/chat/s/7e1a78f2-29b8-402b-981e-6f7386d1ecfa

import java.util.HashMap;
import java.util.Map;

public class q1726 {

    public int tupleSameProduct(int[] nums) { // most efficient
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int count = map.merge(nums[i] * nums[j], 1, Integer::sum);
                sum += 8 * (count - 1);
            }
        }
        return sum;
    }

    public static int tupleSameProduct1(int[] nums) { // less efficient but n2
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;

        // Iterate over all possible pairs and store their product counts
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        int count = 0;

        // Calculate the number of valid tuples
        for (int key : productCount.keySet()) {
            int freq = productCount.get(key);
            if (freq >= 2) {
                // For each product that appears `freq` times, the number of tuples is C(freq,
                // 2) * 8
                count += freq * (freq - 1) / 2 * 8; // cobination formula
            }
        }

        return count;
    }

    public static int tupleSameProduct2(int[] nums) { // n*4 t.c.
        int count = 0;
        int n = nums.length;

        // Iterate over all possible pairs (i, j) and (k, l)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product1 = nums[i] * nums[j];

                // Iterate over all other pairs (k, l)
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j)
                        continue; // Ensure k is distinct from i and j
                    for (int l = k + 1; l < n; l++) {
                        if (l == i || l == j)
                            continue; // Ensure l is distinct from i and j

                        int product2 = nums[k] * nums[l];

                        // If the products are equal, increment the count
                        if (product1 == product2) {
                            count++;
                        }
                    }
                }
            }
        }

        // Each tuple (a, b, c, d) can be arranged in 8 ways
        return count * 8;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        System.out.println(tupleSameProduct2(arr));
    }
}
