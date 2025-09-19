import java.util.ArrayList;
import java.util.List;

public class tripletCompare {
    static List<Integer> tripletCompares(List<Integer> a, List<Integer> b) {
        int aliceS = 0;
        int bobS = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceS++;
            }
            if (b.get(i) > a.get(i)) {
                bobS++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(aliceS);
        ans.add(bobS);
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 10, 20, 30 };
        int b[] = { 30, 40, 50 };
        System.out.println(tripletCompares(a, b));
    }
}
