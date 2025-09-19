package cw19DSAArrPrefixSum;

//prefix  sum without creating a new array
public class prefSum {
    static void makePrefixSum(int arr[]) {
        int n = arr.length;
        // int pref[] = new int[n];
        // pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
            System.out.print(arr[i - 1] + " ");
        }
        // return pref;
        System.out.print(arr[n - 1]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 0, 4 };
        // System.out.print(arr[0]+" ");
        makePrefixSum(arr);
        System.out.println();
        // for (int i : arr) {
        // if (arr[i]==2*(i+1)) {
        // System.out.print(i+" ");
        // }
        // }
        // for (int i = 0; i < arr.length-1; i++) {
        //     if (arr[i] == 2 * arr[i + 1]) {
        //         System.out.print(arr[i] + " ");
        //     }
        // }
    }
}
