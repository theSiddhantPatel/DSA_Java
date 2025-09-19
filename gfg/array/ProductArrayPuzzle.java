package array;

public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int mul = 1, mul2 = 1, count0 = 0;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
            if (arr[i] != 0) {
                mul2 *= arr[i];
            } else
                count0++; // if(arr[i]==0)
        }
        for (int j = 0; j < arr.length; j++) {
            if (count0 == 1 && arr[j] == 0) {
                arr[j] = mul2;

            } else if (arr[j] != 0)
                arr[j] = mul / arr[j];
            else
                arr[j] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr2[] = { 0, 12 };
        productExceptSelf(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        } System.out.println();
        productExceptSelf2(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        // System.out.println(productExceptSelf(arr));
    }

    public static int[] productExceptSelf2(int arr[]) {
        int n = arr.length;
        int[] result = new int[n];

        // Step 1: Calculate prefix product
        result[0] = 1; // Prefix product for the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Step 2: Calculate suffix product and multiply with prefix product
        int suffixProduct = 1; // Suffix product initially 1
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= arr[i];
        }

        return result;
    }
}