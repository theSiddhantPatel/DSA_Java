package cw13;

public class passByValue {
    public static void increase(int p) {
        p = p * 2;
        // System.out.println(p);
    }

    public static void main(String[] args) {
        int p = 10;
        increase(p);
        System.out.println(p);
    }
}
