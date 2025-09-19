package striverDsaNotion.array;

import java.util.ArrayList;

public class xor1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] cumXor = new int[n];
        cumXor[0] = arr[0];
        for (int i = 1; i < n; i++) {
            cumXor[i] = cumXor[i - 1] ^ arr[i];

        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int xorVal = cumXor[r] ^ (l == 0 ? 0 : cumXor[l - 1]);
            res.add(xorVal);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

    }

    public int[] xorQueries1(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        int res[] = new int[m];
        for (int i = 1; i < n; i++) { // arr -> prefix
            arr[i] = arr[i] ^ arr[i - 1];
        }
        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = l > 0 ? (arr[r] ^ arr[l - 1]) : arr[r];
        }
        return res;
    }
}
