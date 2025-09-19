package cw31;

import java.util.Scanner;

//greatest common devisor in two numbers multiple factor
public class gcd {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int gcdn = 1;
        System.out.println("Enter n");
        int n = s.nextInt();
        System.out.println("Enter m");
        int m = s.nextInt();
        for (int i = 1; i <= (n + m + 1) / 2; i++) {
            if (n % i == 0 && m % i == 0) {
                gcdn = i;
            }

        }
        System.out.print("Greatest common devisor of both numbers is " + gcdn);
    }
}
