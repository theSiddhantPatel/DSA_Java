package cw9;

public class loops {

    public static void pyramid(int n) {
        for (int i = 1; i < n; i += 2) {
            for (int j = (n - 1 - i) / 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j - 1) % n == 0)
                    System.out.print(n + " ");
                else
                    System.out.print((i + j - 1) % n + " ");
            }
            System.out.println();
        }
    }

    public static void enenOdd(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(1);
                else
                    System.out.print(2);
            }
            System.out.println();
        }
    }

    public static void numPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int k = i;
            for (int j = 0; j <= 2 * i; j++) {
                if (j <= i)
                    System.out.print(j + 1);
                else

                    System.out.print(k--);
            }
            System.out.println();

        }
    }

    public static void hollowPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2 * i; j++) {
                if (j == 0 || i == n - 1 || j == 2 * i - 1) {
                    System.out.print(i + 1);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pyramid(10);
        // numberRectangle(7);
        // enenOdd(4);
        // numPyramid(4);
        hollowPyramid(7);
    }
}
