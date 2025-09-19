package string;

public class longestUniqueSubstring {
    public static int longestUniqueSubstr(String s) {
        // code here
        int[] arr = new int[26];
        int len = 0;
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            if (arr[charIndex] != 0) {
                len = Math.max(len, arr[charIndex]);
            }
            arr[charIndex] = i + 1;
            maxlen = Math.max(maxlen, i - len + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String str = "siddhantpatel";
        System.out.println(longestUniqueSubstr(str));
    }
}