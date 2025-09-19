package cw9of70;

import java.util.Scanner;

public class evenOdd {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x");
        int x = s.nextInt();
        if (x % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");

    }
}
