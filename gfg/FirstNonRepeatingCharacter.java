public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeating(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            boolean isRepeating = false;
            // Check if the current character repeats
            for (int j = 0; j < n; j++) {
                if ( str.charAt(i) == str.charAt(j)&&i != j ) {
                    isRepeating = true;
                    break;
                }
            }
            // If no repetition is found, return the character
            if (!isRepeating) {
                return str.charAt(i);
            }
        }
        // If no non-repeating character is found, return a placeholder
        return '_';
    }

    public static void main(String[] args) {
        String input = "geekforg";
        char result = findFirstNonRepeating(input);
        if (result != '_') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating characterfound.");
        }
    }

}
