package cw27;

import java.util.Scanner;

public class return_statement {
    public static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter Second number");
        int b = s.nextInt();
        System.out.println("The addition is " + add(a, b));
    }
}