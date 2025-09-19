package string;

import java.util.*;
import string.*;

//1910. Remove All Occurrences of a Substring
//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/?envType=daily-question&envId=2025-02-11
//https://chatgpt.com/c/67abc040-54d0-8000-9858-851691279f4a
public class q1910 {

    // public static String removeOccurrences(String s, String part) {
    // StringBuilder ans = new StringBuilder();
    // int n2 = part.length();
    // for (int i = 0; i < s.length(); i += part.length()) {
    // if (s.contains(part) == false)
    // return s.toString();
    // if (s.substring(0, i + 1) == part) {
    // s = s.replace(part, "");
    // ans.append(s.toString());

    // }
    // }
    // return s.toString();
    // }

    // public static void main(String[] args) {
    // System.out.println(removeOccurrences("siddhant", "d"));
    // }
    // }
    class Solution20percentbeat {

        public static String removeOccurrences(String s, String part) {
            StringBuilder ans = new StringBuilder(s); // Initialize with the original string

            while (ans.indexOf(part) != -1) { // Keep removing as long as 'part' exists
                int index = ans.indexOf(part); // Find the starting index of 'part'
                ans.delete(index, index + part.length()); // Delete the substring from StringBuilder
            }

            return ans.toString(); // Return the final modified string
        }
    }

    class Solution50 {
        public String removeOccurrences(String s, String part) {
            int p = part.length();
            StringBuilder ans = new StringBuilder();
            for (char c : s.toCharArray()) {
                ans.append(c);
                if (ans.length() >= p && ans.substring(ans.length() - p).equals(part)) {
                    ans.delete(ans.length() - p, ans.length());
                }
            }
            return ans.toString();
        }
    }

    class Solution95 {
        public String removeOccurrences(String s, String part) {
            StringBuffer str = new StringBuffer(s);
            while (str.length() > 0 && str.indexOf(part) < str.length()) {
                if (str.indexOf(part) == -1)
                    return str.toString();
                else
                    str.delete(str.indexOf(part), str.indexOf(part) + part.length());
            }

            return str.toString();
        }
    }

}