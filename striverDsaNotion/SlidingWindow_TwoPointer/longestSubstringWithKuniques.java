package striverDsaNotion.SlidingWindow_TwoPointer;

//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
// a premium problem of leetcode, so gfg is here
public class longestSubstringWithKuniques {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int windowStart = 0;
        int windowEnd = 0;
        int len = 0;
        // int maxLen = Integer.MIN_VALUE;//simply assign -1;
        int maxLen = -1;
        int[] freqHash = new int[26];
        int uniqueCharCount = 0;

        while (windowEnd < n) {
            int index = s.charAt(windowEnd) - 97;
            if (freqHash[index] == 0) {
                uniqueCharCount++;
                freqHash[index]++;
            } else
                freqHash[index]++;

            if (uniqueCharCount == k) {
                len = windowEnd - windowStart + 1;
                maxLen = Math.max(maxLen, len);
            }

            // shrinking phase
            else if (uniqueCharCount > k) {
                while (windowStart < windowEnd && uniqueCharCount > k) {
                    index = s.charAt(windowStart) - 97;
                    freqHash[index]--;
                    windowStart++;
                    if (freqHash[index] == 0) {
                        uniqueCharCount--;
                    }
                }
            }
            windowEnd++;
        }
        // return maxLen == Integer.MIN_VALUE ? -1 : maxLen;// or assign maxLen=-1 in
        // above code
        return maxLen;
    }

    public static void main(String[] args) {
        longestSubstringWithKuniques x = new longestSubstringWithKuniques();
        System.out.println(x.longestKSubstr("aabacbebebe", 3));
    }
}