import java.util.Scanner;

public class q3bigPrimeFact {
    // public static void main(String[] args) {
    //     primeNumUptoN(12);
    // }
    // Scanner s = new Scanner(System.in);
    // int T = s.nextInt();
    // for (int i = 0; i < T; i++) {
    // long n = s.nextLong();
    // System.out.println(bigPrimeFact(n));
    // }
    // }

    // public static void primeNumUptoN(long n)
    public static void main(String[] args) {
        
    

     
        Scanner s = new Scanner(System.in);
        // int n1 = s.nextInt();
        int n2 = s.nextInt();
        for (int i = 1; i <= n2; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;

                }
                if (i == j) {
                    System.out.print(j + " ");
                }

            }
        }
        s.close();
        // System.out.println(10);
    }
}