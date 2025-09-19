package cw17;

public class swap {
    public static void main(String[] args) {
        System.out.println("temp method");
        System.out.println("before swapping values");
        int a = 5, b = 4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping values");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("using sum method for swapping values");
        int c = 5, d = 4;
        System.out.println("before swapping values");

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("after swapping values");
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("using mul method for swapping values");
        int e = 5, f = 4;
        System.out.println("before swapping values");

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        e = e * f;
        f = e / f;
        e = e / f;
        System.out.println("after swapping values");
        System.out.println("e = " + e);
        System.out.println("f = " + f);

    }
}
