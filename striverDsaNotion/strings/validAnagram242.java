package striverDsaNotion.strings;

import java.util.Arrays;

public class validAnagram242 {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        validAnagram242 x = new validAnagram242();
        System.out.println(x.isAnagram("anagram", "nagaram"));
    }
}
