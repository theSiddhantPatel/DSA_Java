package cw19;

//prefix  sum without creating a new array
public class prefSum {
    static int[] makePrefixSum(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    static void prefixSumQueries(int[] prefixSumArr, int i, int j) {
        if (i == 1)
            System.out.println(prefixSumArr[j - 1]);
        else
            System.out.println(prefixSumArr[j - 1] - prefixSumArr[i - 2]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 5 };
        makePrefixSum(arr);
        System.out.println();

        prefixSumQueries(arr, 1, 4);
        prefixSumQueries(arr, 2, 5);

    }
}
