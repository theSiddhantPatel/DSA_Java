package contest;

public class start202 {
    public static int buyingFlowers(int n) {
        int ans = (n / 3) * 5;
        if (n % 3 == 1)
            ans += 3;
        if (n % 3 == 2)
            ans += 4;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(buyingFlowers(16));
    }
}
