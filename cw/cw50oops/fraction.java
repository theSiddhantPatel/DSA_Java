package cw50oops;

public class fraction {
    public static class Fraction {
        int num;
        int den;

        public Fraction(int num, int den) { // costructor
            this.num = num;
            this.den = den;

        }

        public void simplify(int num, int den) {
            if (den % num == 0) {
                den = den % num;
                num = 1;
            }
        }

    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(30, 7);
        Fraction f2 = new Fraction(30000, 70);
        simplify(30,7);

        System.out.println(f1.num + "/" + f1.den);
        System.out.println(f2.num + "/" + f2.den);

    }
}
