package contest.weekly465;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class restoreFinishingOrder {
    public static int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for (int x : friends)
            set.add(x);
        List<Integer> result = new ArrayList<>();
        for (int x : order) {
            if (set.contains(x)) {
                result.add(x);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] order = { 1, 4, 5, 3, 2 };
        int[] friends = { 2, 5 };
        int[] res = recoverOrder(order, friends);
        System.out.println(Arrays.toString(res));
    }
}
