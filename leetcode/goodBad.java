// public class goodBad {

//     public static int countGoodStrings(int low, int high, int zero, int one) {
//         return recur(low, high, zero, one, 0);
//     }

//     public static int recur(int low, int high, int zero, int one, int len) {
//         // base case
//         if (len > high) {
//             return 0;

//         }
//         int zerolen = len + zero;
//         int oneLen = len + one;
//         int zeroCount = (zerolen >= low && zerolen <= high) ? 1 : 0;

//         int oneCount = (oneLen >= low && oneLen <= high) ? 1 : 0;
//         int res = zeroCount + recur(low, high, zero, one, zerolen) +
//                 oneCount + recur(low, high, zero, one, oneLen);
//         return res;
//     }

//     public static void main(String[] args) {

//         System.out.println(countGoodStrings(2, 3, 1, 2));
//     }
// }
class goodBad {
    public static int countGoodStrings(int low, int high, int zero, int one) {
        int mod = 1_000_000_007;
        int[] dp = new int[high+1];
        dp[0] = 1;

        for(int i = 1; i <= high ; i++) {
            if(zero > 0 && i >= zero) {
                dp[i] = (dp[i] + dp[i-zero]) % mod;
            }
            if(one > 0 && i >= one) {
                dp[i] = (dp[i] + dp[i-one]) % mod;
            }
        }

        int count = 0;
        for(int i = low; i <= high; i++)
            count = (count + dp[i]) % mod;
        
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countGoodStrings(2, 3, 1, 2));

        System.out.println(1_1__0_00);
    }
}