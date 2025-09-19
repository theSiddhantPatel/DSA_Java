import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int x = 0, y = 0, z = 0;
        while (t-- > 0) {
            x += s.nextInt();
            y += s.nextInt();
            z += s.nextInt();
        }
        if (x ==0&&y==0&&z==0)
            System.out.println("YES");
        else
            System.out.println("NO");
            s.close();
    }
}
