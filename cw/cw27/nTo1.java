package cw27;

//print N to 1 using recursion(a stack based(LIFO) method)
public class nTo1 {

    public static void printDecreasing(int n) {
        // base case
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        // self work
        System.out.print(n + " ");
        // recursive work
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        printDecreasing(10);
    }

}
