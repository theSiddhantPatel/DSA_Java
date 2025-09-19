package striverDsaNotion.strings;

public class validPalindrome125 {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toUpperCase(s.charAt(start)) != Character.toUpperCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        validPalindrome125 x = new validPalindrome125();
        System.out.println(x.isPalindrome("race car"));
    }
}
