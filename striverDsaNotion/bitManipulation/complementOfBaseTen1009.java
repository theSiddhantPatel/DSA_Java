package striverDsaNotion.bitManipulation;

public class complementOfBaseTen1009 {

    // Method 1 : using bit manipulation
    public int bitwiseComplement(int n) {
        if (n == 0)
            return 1;
        int mask = 0, x = n;
        while (x > 0) {
            mask = mask << 1 | 1;
            x = x >> 1;
        }
        return (~n) & mask;
        /*
         * (~n) & mask == mask - n
         * ✅ Yes — for positive integers
         * 🚫 No — not always for all integer types or edge cases
         */
    }

    // Method 2 : without using bit manipulation(self generated)
    public int bitwiseComplement2(int n) {
        int count = 0;
        int x = n;
        while (n >= 2) {
            n = n / 2;
            count++;
        }
        int y = (int) Math.pow(2, count + 1) - 1;
        int res = y - x;
        return res;
    }

    public static void main(String[] args) {
        complementOfBaseTen1009 x = new complementOfBaseTen1009();
        System.out.println(x.bitwiseComplement(16));
    }
}
