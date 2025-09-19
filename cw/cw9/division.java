package cw9of70;

import java.util.Scanner;

public class division {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter x");
        int x = s.nextInt();
        if (x % 5 == 0) {
            System.out.println("yes");
        } else
            System.out.println("no");
    }
}