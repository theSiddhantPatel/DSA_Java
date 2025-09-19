package tree;
public class kthDistance {
    public static boolean arrDuplicate(int[] arr, int k) {

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j <= k; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                    break;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 5, 2 };
        System.out.println(arrDuplicate(arr, 3));
    }
}
