package cw19;

public class prefixSum {
    static void makePrefixSum(int arr[]) {
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
            System.out.print(pref[i - 1] + " ");
        }
        // return pref;
        System.out.print(pref[n - 1]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 4, 5, 6 };
        makePrefixSum(arr);
    }
}
