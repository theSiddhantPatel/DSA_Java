package other.GFG.array;

import java.util.HashMap;

public class longestConsecutiveSubsequence {
    static int solution(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, true);
        }
        int maxLen = 0;
        for (int j : arr) {
            if (!map.containsKey(j - 1)) {
                int currNum = j;
                int currLen = 1;
                while (map.containsKey(currNum + 1)) {
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);

            }

        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 9, 4, 3, 7 };
        System.out.println(solution(arr));
    }
}
