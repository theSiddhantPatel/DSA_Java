package striverDsaNotion.bitManipulation;

public class numberOf1Bits191 {
    // set bits means how many bits are 1
    // there are 2 approaches to solve this question
    public int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            n = n & n - 1; // used to set 0 to left most bit (// removes the lowest set bit)
            count++;
        }
        return count;
    }

    // 2nd approach
    public int hammingWeight2(int n) {
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            if (((n >> i) & 1) == 1) // used to set ith bit 0
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        numberOf1Bits191 x = new numberOf1Bits191();
        System.out.println(x.hammingWeight2(12));
    }
}
