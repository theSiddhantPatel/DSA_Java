//WAP to reverse the given arraylist
// input= [0,10,3,5,2,10];
// output=[10,2,5,3,10,0];
package cw24;

import java.util.ArrayList;
import java.util.Collections;

public class revArraylist {
    static void reverseArraylist(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            /*
             * int temp=a;
             * a=b;
             * b=temp;
             */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(020);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original list = " + list);
        reverseArraylist(list);
        System.out.println("Reversed list = " + list);
        // sorting of list
        Collections.sort(list);
        System.out.println("sorted list is = " + list);
        Collections.reverse(list);
        System.out.println("reversed list is = " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add(0,"To");
        l1.add("Physics");
        l1.add(1,"Wallah");
        Collections.sort(l1);
        System.out.println((l1));
        // reverse order sort
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);

    }

}
