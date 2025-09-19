import java.util.Scanner;

public class ShiftingStacks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = s.nextInt();
            }
            int extrablocks = 0;
            int i;
            for (i = 0; i < n; i++) {
                if (extrablocks >= 0) {
                    extrablocks = extrablocks + h[i] - i;
                } else
                    break;
            }
            System.out.println(extrablocks >= 0 && i == n ? "YES" : "NO");
            s.close();
        }
    }
}
