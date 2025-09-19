package cw24;

import java.util.*;

public class al2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            l1.add(s.nextInt());
        }
        for (int j = 0; j < l1.size(); j++) {
            System.out.print(l1.get(j) + " ");

        }
    }
}
