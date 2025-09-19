package striverDsaNotion.bitManipulation;

public class reverseBits190 {
    public int reverseBits(int n) {
        // logic problem
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int lastBit = n & 1; // extract last bit
            result = (result << 1) | lastBit; // append bit to result
            n >>>= 1; // right shift (unsigned)
            /*
             * Yes, if your number n is always positive (i.e., n > 0),
             * then: n >>= 1; is the same as n >>>= 1;
             */
        }
        return result;
    }

    public static void main(String[] args) {
        reverseBits190 x = new reverseBits190();
        System.out.println(x.reverseBits(10));
    }

}
