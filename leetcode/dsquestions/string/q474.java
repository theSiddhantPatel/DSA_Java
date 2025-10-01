package dsquestions.string;

//https://leetcode.com/problems/ones-and-zeroes/description/

public class q474 {
    public int findMaxForm(String[] strs, int m, int n) {
        // solution gone wrong
        int l = strs.length;
        int min = Math.min(m, n);
        int count = 0;

        for (int i = 0; i < l; i++) {
            if (strs[i].length() <= min)
                count++;
            else {
                int j = 0;
                boolean flag = true;
                int zeros = 0, ones = 0;
                while (j < strs[i].length()) {
                    if (strs[i].charAt(j) == '0')
                        zeros++;
                    else
                        ones++;
                    j++;
                    if (zeros > m || ones > n) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        q474 x = new q474();
        String[] strs = { "10", "0001", "111001", "1", "0" };
        System.out.println(x.findMaxForm(strs, 5, 3));
    }
}
