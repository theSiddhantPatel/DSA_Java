package striverDsaNotion.strings;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();

        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            str.append(first[i]);
        }
        return str.toString();

    }
}
