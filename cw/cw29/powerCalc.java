package cw29;

public class powerCalc {
    public static int pq(int p, int q) {
        if (q == 0)
            return 1;
        return pq(p, q - 1) * p;
    }

    public static void main(String[] args) {
        System.out.println(pq(2, 3));
    }
}
