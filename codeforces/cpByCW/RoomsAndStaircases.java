import java.util.Scanner;

public class RoomsAndStaircases {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int visited = 0;
                String str = s.next();
                if (str.charAt(0) == '1' || str.charAt(n - 1) == '1') {
                    System.out.println(n * 2);
                } else {
                    for (char ch : str.toCharArray()) {
                        if (ch == '1')
                            visited += 2;
                        else
                            visited += 1;
                    }
                    System.out.println(visited);
                }
            }
        }
    }
}
