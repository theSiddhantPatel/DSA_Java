import java.util.*;

@SuppressWarnings("resource")
// https://codeforces.com/problemset/problem/236/A
public class q11BoyOrGirl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else
                charCountMap.put(ch, 1);
        }
        System.out.println(charCountMap.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}