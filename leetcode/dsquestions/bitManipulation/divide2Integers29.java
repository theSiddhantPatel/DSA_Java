package dsquestions.bitManipulation;

public class divide2Integers29 {
    public int divide(int dividend, int divisor) {
        // abs value of 2^-31 is > (2^31)-1. so we use this if case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);
        // ^ (XOR) → true if exactly one of them is true, otherwise false
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        /*
         * int ranges from −2,147,483,648 to 2,147,483,647 (Integer.MIN_VALUE to
         * Integer.MAX_VALUE).
         * Absolute value of Integer.MIN_VALUE is 2147483648, which is too big for int.
         * 
         * So if you do:
         * int x = Math.abs(Integer.MIN_VALUE);
         * you don’t get 2147483648. Instead you still get -2147483648 (because it
         * overflowed).
         * 
         * That’s why your code failed for:
         * dividend = -2147483648
         * divisor = 1
         * 
         * Why casting to long helps
         * When we write:
         * long a = Math.abs((long) dividend);
         * this happens:
         * (long) dividend → before calling Math.abs, we promote the int dividend to
         * long.
         * So -2147483648 becomes -2147483648L, which fits fine in a long.
         * Math.abs(long) → now Java calls the long version of Math.abs, which can
         * safely return 2147483648L.
         * (long can handle much larger values, up to ~9e18).
         * 
         * So:
         * Without cast → Math.abs(int) is called, which overflows.
         * With cast → Math.abs(long) is called, which works safely.
         */
        int quotient = 0;
        while (a >= b) {
            int i = 0;
            while (b << i <= a) {
                i++;
            }
            i--; // step back;
            /*
             * After the loop, i is 1 step too far.
             * Example: if dividend=15, divisor=3 →
             * divisor << 2 = 12 (<= 15), divisor << 3 = 24 (> 15).
             * Loop ends with i=3.
             * Then you add 1 << 3 = 8 instead of 1 << 2 = 4.
             * 
             * You should subtract 1 from i when using it.
             */
            quotient += 1 << i;
            a -= b << i;
        }
        return (negative) ? -quotient : quotient;

    }

    public static void main(String[] args) {
        divide2Integers29 x = new divide2Integers29();
        System.out.println(x.divide(50, 3));
        System.gc();// garbage cleaner
    }

}
