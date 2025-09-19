package cw31;

import java.util.Scanner;

//gcd*lcm=x*y;
//lcm=x*y/gcd
public class lcm {
    // first we will find gcd
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return (gcd(y, x % y));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x");
        int x = s.nextInt();
        System.out.println("Enter y");
        int y = s.nextInt();
        gcd(x, y);
        System.out.println("LCM of " + x + " and " + y + " is " + (x * y / gcd(x, y)));
    }
}
