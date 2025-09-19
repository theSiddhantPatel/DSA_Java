import java.util.*;

@SuppressWarnings("resource")

public class ThreeFriends {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            if (-x + y + z == 0 || x - y + z == 0 || x + y - z == 0 || x - y - z == 0 || -x - y + z == 0
                    || -x + y - z == 0)
                System.out.println("yes");
            else
                System.out.println("no");
            /*
             * you can simply write this
             * if (x + y == z || y + z == x || z + x == y) {
             * System.out.println("yes");
             * } else {
             * System.out.println("no");
             * }
             */
        }

    }
}