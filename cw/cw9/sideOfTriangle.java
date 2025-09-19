package cw9of70;

import java.util.Scanner;

public class sideOfTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter x");
        int x = s.nextInt();
        System.out.println("Enter y");
        int y = s.nextInt();
        System.out.println("Enter z");
        int z = s.nextInt();
        if ((x + y) > z) {
            if ((y + z) > x) {
                if ((x + z) > y) {
                    System.out.println("Yes");
                }
            }
        } else
            System.out.println("No");

    }

}
