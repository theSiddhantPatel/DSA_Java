package cw15;

//in deep copy of array a new address is allocated to the array with the same values
public class deepCopy {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arr);// address

        int arr2[] = arr.clone();

        System.out.println(arr2);// new address allocated(deepCopy)
        arr2[0] = 10;// only changes in arr2

        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }

}
