package cw13;

public class q1 {
    public static void temp(int p) {
        int q = p;
        q = q - 100;
        p=q;
        System.out.println(p);
        // return;
    }

    public static void main(String[] args) {
        int p = 890;
        temp(p);
        // System.out.println(temp(p));
    }
}
