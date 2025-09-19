// 
package cw29;
// import java.util.*;

public class Main {
    static int ctr = 0;

    public static int calcDigits(int num) {
        if (num != 0) {
            ctr++;
            calcDigits(num / 10);
        }
        return ctr;
    }

    public static void main(String[] args) {
        int num = 3962; // You can change this to any positive integer
        int digits = calcDigits(num);
        System.out.println("The number of digits in " + num + " is " + digits);
    }
}
