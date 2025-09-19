package cw29;

public class pPOWq {
    public static int pow(int p, int q) {
        if (q == 0)
            return 1;
        int smallPow = pow(p, q / 2);
        if (q % 2 == 0)
            // even case
            return smallPow * smallPow;
        // odd case
        return smallPow * smallPow * p;
    }

    public static void main(String[] args) {
        System.out.println(pow(2,  4));
    }

}
// public class powerCalc {
// public static int pq(int p, int q) {
// if (q == 0)
// return 1;
// return pq(p, q - 1) * p;
// }
// public static void main(String[] args) {
// System.out.println(pq(2, 3));
// }
// }
