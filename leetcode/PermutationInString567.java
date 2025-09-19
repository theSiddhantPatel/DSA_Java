public class PermutationInString567 {

    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Initialize frequency arrays for the first window
        for (int i = 0; i < len1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // Compare the frequency arrays
        if (matches(freq1, freq2)) {
            return true;
        }

        // Slide the window over s2
        for (int i = len1; i < len2; i++) {
            // Add the new character to the window
            freq2[s2.charAt(i) - 'a']++;
            // Remove the old character from the window
            freq2[s2.charAt(i - len1) - 'a']--;

            // Compare the frequency arrays
            if (matches(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }

    private static boolean matches(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("id", "siddhant"));
    }
}

/*
 * class Solution {
 * public boolean checkInclusion(String s1, String s2) {
 * int freq[]=new int[26];
 * for(int i=0;i<s1.length();i++){
 * freq[s1.charAt(i)-'a']++;
 * }
 * int windowSize=s1.length();
 * for(int i=0;i<s2.length();i++){
 * int winIdx=0;int idx=i;
 * int wfreq[]=new int[26];
 * while(winIdx<windowSize&&idx<s2.length()){
 * wfreq[s2.charAt(idx)-'a']++;
 * winIdx++;idx++;
 * }
 * if(isFreqSame(freq,wfreq)){
 * return true;
 * }
 * }
 * return false;
 * }
 * public boolean isFreqSame(int freq1[],int freq2[]){
 * for(int i=0;i<26;i++){
 * if(freq1[i]!=freq2[i]){
 * return false;
 * }
 * }
 * return true;
 * }
 * }
 */ 