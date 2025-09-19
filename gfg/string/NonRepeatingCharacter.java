package string;

public class NonRepeatingCharacter {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        for (int i = 0; i < s.length(); i++) {
            boolean repeat = false;
            for (int j = 0; j < s.length(); j++) {
                if ((s.charAt(i) == s.charAt(j)) && i!=j) {
                    // return s.charAt(i);
                    repeat = true;
                    break;

                }
            }
                if (!repeat) {
                    return s.charAt(i);
                }
        }
        return '$';

    }

    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("geekg"));
     
    }
}