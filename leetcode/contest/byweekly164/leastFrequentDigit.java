package contest.byweekly164;

import java.util.HashMap;
import java.util.Map;

public class leastFrequentDigit {
    public int getLeastFrequentDigit(int n) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int d = 0; d < 10; d++) {
            freq.put(d, 0);
        }
        while (n > 0) {
            int digit = n % 10;
            freq.put(digit, freq.get(digit) + 1);
            n /= 10;
        }
        int minFreq = Integer.MAX_VALUE;// >2^31
        int leastDigit = -1;
        for (int d = 0; d < 10; d++) {
            int f = freq.get(d);
            if (f > 0) { // only consider digits that appear
                if (f < minFreq || (f == minFreq && d < leastDigit)) {
                    minFreq = f;
                    leastDigit = d;
                }
            }
        }
        return leastDigit;
    }

    public static void main(String[] args) {
        leastFrequentDigit x = new leastFrequentDigit();
        System.out.println(x.getLeastFrequentDigit(5553322));
    }
}
