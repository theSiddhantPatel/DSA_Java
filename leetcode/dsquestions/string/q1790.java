package string;

//1790. Check if One String Swap Can Make Strings Equal
//https://chat.deepseek.com/a/chat/s/2f6a2f6b-a8da-46cc-abe1-73c7dcbf6b8e
public class q1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        // If the strings are already equal, return true
        int count = 0;
        int[] misMatch = new int[2];
        // Store the indices of mismatched characters
        for (int i = 0; i < s1.length(); i++) {
            if (count >= 2)
                return false;
            // If more than 2 mismatches, return false

            if (s1.charAt(i) != s2.charAt(i)) {
                misMatch[count] = i;
                count++;

            }
        }
        if (count == 2) {
            int first = misMatch[0];
            int second = misMatch[1];
            // If exactly 2 mismatches, check if swapping makes the strings equal
            return (s1.charAt(first) == s2.charAt(second) && s2.charAt(first) == s1.charAt(second));
        }
        return false;
        // If 0 or 1 mismatch, return false (since 1 mismatch cannot be fixed with a
        // single swap)
    }
}
