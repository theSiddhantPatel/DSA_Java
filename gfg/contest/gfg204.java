
public class gfg204 {
    public static long countPairs(long[] arr) {
        // code here
        // long count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (i != j && (arr[i] - arr[j]) % (i - j) == 0 && (arr[i] - arr[j]) / (i - j)
        // == 1) {
        // count++;
        // }
        // }
        // }
        // return count;
        // long pair = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (i != j && (arr[i] - arr[j]) % (i - j) == 0 && (arr[i] - arr[j]) / (i - j)
        // == 1)
        // pair++;
        // }
        // }
        // return pair;

        // code here
        long[] longArr = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            longArr[i] = arr[i];
        }
        long pair = 0;
        long n = longArr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long m = longArr[i] - longArr[j];
                if (i != j && (m) % (i - j) == 0 && (m) / (i - j) == 1)
                    pair++;
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        long[] arr = { 1, 6, 0, 2, 3, 8 };
        System.out.println(countPairs(arr));
    }
}
