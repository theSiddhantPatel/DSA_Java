import java.util.*;

@SuppressWarnings("resource")
public class GroupAssignment {
    // https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/GRPASSN?tab=Submissions
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int s = sc.nextInt();
            int arr[] = new int[s];
            for (int i = 0; i < s; i++) {
                arr[i] = sc.nextInt();
            }
            for (int n : arr) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
            boolean flag = false;

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() % e.getKey() == 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
}