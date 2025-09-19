package striverDsaNotion.strings;

public class FirstOccurrenceInString28 {
    public int strStr(String haystack, String needle) {

        int n = needle.length();
        int m = haystack.length();
        if (n > m)
            return -1;
        for (int i = 0; i <= m-n; i++) {
            int j = 0;
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j += 1;
            }
            if (j == n)
                return i;
        }
        return -1;
    }
}
