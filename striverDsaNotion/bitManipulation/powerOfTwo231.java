package striverDsaNotion.bitManipulation;

public class powerOfTwo231 {
    public boolean isPowerOfTwo(int n) {
        if (n > 0 && (n & n - 1) == 0) {//// used to set 0 to left most bit (// removes the lowest set bit)
            /*
             * Why do we add n > 0 in the condition?: n > 0 && (n & (n - 1)) == 0
             * Because the expression:
             * (n & (n - 1)) == 0
             * is also true for n = 0, but 0 is not a power of 2!
             */
            return true;
        }
        return false;
    }
}
