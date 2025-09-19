import java.util.*;

//https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/WATSCORE?tab=statement
public class ThatIsMyScore {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[12];
            for (int i = 0; i < n; i++) {
                int a = s.nextInt();
                int b = s.nextInt();
                if (b > arr[a])
                    arr[a] = b;
            }
            int score = 0;
            for (int i = 0; i < 9; i++)
                score += arr[i];
            System.out.println(score);

        }
        s.close();

    }
}
