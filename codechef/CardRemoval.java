import java.util.*;
// import java.lang.*;
// import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt();
            int[] arr = new int[x];
            for (int i = 0; i < x; i++) {
                arr[i] = s.nextInt();

            }
            Arrays.sort(arr);
            int max = 1;
            int count = 1;
            for (int i = 0; i < x - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                    max = Math.max(max, count);
                } else
                    count = 1;

            }
            System.out.println(x - max);
        }

        s.close();
    }

}
