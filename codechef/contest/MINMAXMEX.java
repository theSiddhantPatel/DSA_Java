package contest;

import java.util.*;

public class MINMAXMEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // number of test cases

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();

            Set<Integer> both = new HashSet<>();
            Set<Integer> one = new HashSet<>();

            for (int i = 0; i < n; i++) {
                if (a[i] == b[i]) {
                    both.add(a[i]);
                } else {
                    one.add(a[i]);
                    one.add(b[i]);
                }
            }

            int mex = 0;
            boolean first = true;

            while (true) {
                if (both.contains(mex)) {
                    mex++;
                } else if (first && one.contains(mex)) {
                    mex++;
                    first = false;
                } else {
                    break;
                }
            }

            System.out.println(mex);
        }

        sc.close();
    }
}