
// package Java DSA.LC;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<String> partitionString(String s) {
        List<String> ps = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
          String b= String.valueOf(s.charAt(i));
            ps.add(b);
        }

    }
}
