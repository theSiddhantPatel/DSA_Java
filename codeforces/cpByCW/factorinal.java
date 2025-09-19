public class factorinal {
    public static long fact(int n) {
        if (n == 0) {
            return 1;
        }
        long ans = 1;
        while (n >= 1) {
            ans *= n;
            n--;
        }
        return ans;
    }

    public static long nCr(int n, int r) {
        if (n == 0 || r == 0) {
            return 1;
        }
        if (r > n) {
            return 0;
        }
        long ans = fact(n) / (fact(r) * fact(n - r));
        return ans;
    }

    
    public static void main(String[] args) {
        System.out.println(nCr(5, 2));
    }
}
