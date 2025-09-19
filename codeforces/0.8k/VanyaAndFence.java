import java.util.Scanner;
//https://codeforces.com/problemset/problem/677/A
public class VanyaAndFence {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int h=s.nextInt();
    int []a=new int[n];
    int count=0;
    for (int i = 0; i < n; i++) {
        a[i]=s.nextInt();
        if (a[i]>h)
            count+=2;
        else count++;
    }
    System.out.println(count);
    s.close();
   }
}
