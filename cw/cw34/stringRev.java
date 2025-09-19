package cw34;

import java.util.Scanner;

public class stringRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // StringBuilder reversed = new StringBuilder(input);
        // reversed.reverse();
        // System.out.println("Reversed string: " + reversed.toString());
        for (int i = (input.length())-1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        scanner.close();
    }
}
