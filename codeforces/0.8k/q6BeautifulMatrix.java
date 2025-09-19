import java.util.Scanner;

@SuppressWarnings("resource")

public class q6BeautifulMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int k = 0;
        int l = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = s.nextInt();
                if (arr[i][j] == 1) {
                    k = i + 1;
                    l = j + 1;
                }
            }
        }
        System.out.println(Math.abs(3 - k) + Math.abs(3 - l));
    }
}
