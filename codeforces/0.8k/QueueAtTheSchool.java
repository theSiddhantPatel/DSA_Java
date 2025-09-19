import java.util.Scanner;

public class QueueAtTheSchool {
    // https://codeforces.com/problemset/problem/266/B
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        @SuppressWarnings("unused")
        int n = s.nextInt();
        int t = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        char[] chars = str.toCharArray();
        // boolean flag=false;
        while (t > 0) {
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] == 'B' && chars[i + 1] == 'G') {
                    // Swap the characters
                    chars[i] = 'G';
                    chars[i + 1] = 'B';
                    i++;//// Skip the next character to avoid overlapping swaps
                    t--;
                }
            }
        }
        System.out.println(new String(chars));
        s.close();
    }
}

// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int n = scanner.nextInt(); // Length of the string
// int t = scanner.nextInt(); // Number of iterations
// scanner.nextLine(); // Consume the newline character
// String s = scanner.nextLine(); // The string to process
// char[] chars = s.toCharArray(); // Convert string to char array for
// manipulation

// for (int i = 0; i < t; i++) {
// for (int j = 0; j < chars.length - 1; j++) {
// if (chars[j] == 'B' && chars[j + 1] == 'G') {
// // Swap 'B' and 'G'
// chars[j] = 'G';
// chars[j + 1] = 'B';
// j++; // Skip the next character to avoid overlapping swaps
// }
// }
// }

// System.out.println(new String(chars)); // Print the result
// }
// }
