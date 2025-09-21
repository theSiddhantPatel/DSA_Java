public class reverseInteger7 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            // Check for overflow before multiplying
            /*
             * Integer.MAX_VALUE = 2147483647 → last digit is 7 (7>2)
             * if we reverse it except last digit
             * rev=746384741 , and in last if we consider 2 it would be out of range
             * so we check if rev> Integer.maxvalue/10 then return 0
             * 
             * Integer.MIN_VALUE = -2147483648 → last digit is -8
             * if we reverse 8 would be first digit which is greater than 2 so check if
             * rev<Integer.MAX_VALUE/10 retrun 0
             */
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        reverseInteger7 x = new reverseInteger7();
        System.out.println(x.reverse(-123));
    }

    // A faster code
    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            /*
             * The rev == 214748364 && digit > 7 clause matters only when rev exactly equals
             * 214748364. In that scenario:
             * 
             * if digit <= 7 we can safely do rev*10 + digit (max becomes 2147483647)
             * 
             * if digit > 7 it would produce >= 2147483648 and overflow, so we must return
             * 0.
             */
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }
        return rev;
    }

}
/*
 * Start: x = 2147483647, rev = 0
 * 
 * digit = 7 (x % 10)
 * 
 * Check: rev > 214748364 ? 0 > 214748364 → false
 * 
 * Check: rev == 214748364 && digit > 7 ? false
 * 
 * Update: rev = 0*10 + 7 = 7
 * 
 * New x = 214748364
 * 
 * digit = 4
 * 
 * rev checks false
 * 
 * rev = 7*10 + 4 = 74
 * 
 * x = 21474836
 * 
 * digit = 6
 * 
 * rev = 74*10 + 6 = 746
 * 
 * x = 2147483
 * 
 * digit = 3
 * 
 * rev = 746*10 + 3 = 7463
 * 
 * x = 214748
 * 
 * digit = 8
 * 
 * rev = 7463*10 + 8 = 74638
 * 
 * x = 21474
 * 
 * digit = 4
 * 
 * rev = 74638*10 + 4 = 746384
 * 
 * x = 2147
 * 
 * digit = 7
 * 
 * rev = 746384*10 + 7 = 7463847
 * 
 * x = 214
 * 
 * digit = 4
 * 
 * rev = 7463847*10 + 4 = 74638474
 * 
 * x = 21
 * 
 * digit = 1
 * 
 * rev = 74638474*10 + 1 = 746384741
 * 
 * x = 2
 * 
 * digit = 2
 * 
 * Now the checks run BEFORE doing rev = rev * 10 + digit.
 * 
 * Check: rev > 214748364 ? 746,384,741 > 214,748,364 → true
 * 
 * Because that is true, the function returns 0 immediately. We never compute
 * rev * 10 + 2 (which would be 7,463,847,412 and overflow a 32-bit int).
 * 
 * Result: the function returns 0 for x = 2147483647 because appending the final
 * digit would overflow.
 */