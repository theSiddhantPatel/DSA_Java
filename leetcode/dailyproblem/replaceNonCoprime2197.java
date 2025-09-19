package dailyproblem;

import java.util.ArrayList;
import java.util.List;

public class replaceNonCoprime2197 {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            while (ans.size() > 0) {
                int prev = ans.get(ans.size() - 1);
                int curr = nums[i];
                int gcd = gcd(prev, curr);
                if (gcd == 1)
                    break;
                else {
                    ans.remove(ans.size() - 1);
                    int lcm = prev * curr / gcd;
                    nums[i] = lcm;
                }
                /*
                 * In Java ArrayList (and all List implementations):
                 * ans.get(0) → gives you the first element
                 * ans.get(ans.size() - 1) → gives you the last element
                 */
            }
            ans.add(nums[i]);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }

    public static void main(String[] args) {
        replaceNonCoprime2197 x = new replaceNonCoprime2197();
        int[] arr = { 6, 4, 3, 2, 7, 6, 2 };
        System.out.println(x.replaceNonCoprimes(arr));
        // System.out.println(1);
    }
}
