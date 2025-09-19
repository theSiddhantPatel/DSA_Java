package striverDsaNotion.bitManipulation;

public class countingBits338 {
    // bit manipulation method
    static {
        for (int i = 0; i <= 400; i++) {
            countBits(0);
        }
    }

    public static int[] countBits(int n) {

        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    // Modulo check method
    public int[] countBits2(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                res[i] = res[i / 2];
            else
                res[i] = res[i / 2] + 1;
        }
        return res;
    }
}
