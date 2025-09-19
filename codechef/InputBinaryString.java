// public class gg {
    
// }
import java.util.Scanner;

public class InputBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the string (N): ");
        int N = sc.nextInt(); // Read the length of the string
        sc.nextLine(); // Consume the newline character

        String binaryString;
        while (true) {
            System.out.print("Enter a binary string of length " + N + ": ");
             binaryString = sc.nextLine(); // Read the binary string
            
            // Validate the input length and content
            if (binaryString.length() == N && binaryString.matches("[01]+")) {
                break; // Valid input
            } else {
                System.out.println("Invalid input. Please enter a binary string of length " + N + " containing only 0s and 1s.");
            }
        }

        System.out.println("You entered a valid binary string: " + binaryString);
        sc.close();
        Math.abs(N)
    }
}
