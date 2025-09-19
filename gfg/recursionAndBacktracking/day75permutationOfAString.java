package recursionAndBacktracking;

public class day75permutationOfAString {
    // Function to print all permutations of a string
    public static void printPermutations(String str, String ans) {
        // If the string is empty, print the permutation
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        // Iterate through all characters of the string
        for (int i = 0; i < str.length(); i++) {
            // Select the current character
            char ch = str.charAt(i);
            // Remove the selected character from the string
            String remaining = str.substring(0, i) + str.substring(i + 1);
            // Recursively find permutations of the remaining string
            printPermutations(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc"; // Input string
        // System.out.println("All permutations of " + str + " are:");
        printPermutations(str, "");
        // String remaining = str.substring(0, 1) + str.substring(1 + 1);
        // System.out.println(remaining);
    }
}