package cw30;

public class multiple {
    public static void Multiples(int n, int m) {
        // if (m == 1) {
        // System.out.println(n);
        // return;
        // } or we can write the below condition, both are same.
        if (n == 0 || m == 0) {
            return;
        }
        Multiples(n, m - 1);
        System.out.print(n * m + " ");
    }

    public static void main(String[] args) {
        Multiples(5, 5);
    }

}
