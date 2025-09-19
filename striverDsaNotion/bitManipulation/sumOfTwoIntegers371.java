package striverDsaNotion.bitManipulation;

public class sumOfTwoIntegers371 {
    public int getSum(int a, int b) {
        // ⚠️logical problem ⚠️
        while (b != 0) {
            int x = a ^ b; // sum without carry
            int y = (a & b) << 1; // carry
            a = x;
            b = y;
        }
        return a;
    }
}
