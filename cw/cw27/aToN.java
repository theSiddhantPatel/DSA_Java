package cw27;

//print 1 to N using recursion(a stack based(LIFO) method)
public class aToN {
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printIncreasing(10);
    }
}
