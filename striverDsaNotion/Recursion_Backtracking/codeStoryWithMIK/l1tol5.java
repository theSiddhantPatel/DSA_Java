package striverDsaNotion.Recursion_Backtracking.codeStoryWithMIK;

//https:www.youtube.com/playlist?list=PLpIkg8OmuX-IBcXsfITH5ql0Lqci1MYPM

public class l1tol5 {
    // factorial
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // print a string in reverse
    public static void strRev(String str, int index) {
        if (index >= str.length()) {
            return;
        }
        strRev(str, index + 1);
        System.out.print(str.charAt(index));
    }

    // fibonacci
    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);

    }

    // video-5 : tail recursion is better than others (in minimum stack space)
    // preorder and inorder are tail recursion but postorder is not
    public static void main(String[] args) {
        // System.out.println(factorial(5));
        // strRev("palindrome", 0);
        System.out.println(fib(10));

    }
}
