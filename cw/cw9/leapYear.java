package cw9of70;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x for check leap year");
        int x = s.nextInt();
        if (x % 4 == 0 && x % 100 != 0) {
            System.out.println("yes");
        } else if (x % 400 == 0) {
            System.out.println("yes");
        } else
            System.out.println("no");
            
        }
}
