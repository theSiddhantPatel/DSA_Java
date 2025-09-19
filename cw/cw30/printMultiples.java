package cw30;

public class printMultiples {
    public static void multiple(int a, int b) {
        int i = 1;
        if (i == b + 1)
            return;
        System.out.print(a * i + " "); // first complete or print bcz s.c. problem
        multiple(a, i + 1);

    }

    public static void main(String[] args) {
        multiple(4, 5);
    }

}
