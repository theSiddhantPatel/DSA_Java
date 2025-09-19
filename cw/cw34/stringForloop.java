package cw34;

import java.util.Scanner;

public class stringForloop {
    public static void main(String[] args) {
        // remove all the occurrences of "a" from string s="abcax"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a')
                System.out.print("");
            else
                System.out.print(input.charAt(i));

            }
            scanner.close();
    }
}
