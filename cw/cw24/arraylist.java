package cw24;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(505.23f);
        System.out.println(f);
        // Long l=Long.valueOf(2.025);
        // System.out.println(l);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();
        l1.add(3);
        l1.add(5);
        l1.add(55);
        l1.add(554);
        System.out.println(l1);
        // print with for loop of an arraylist
        for (int j = 0; j < l1.size(); j++) {
            System.out.print(l1.get(j) + " ");

        }
        System.out.println("ok");
        // we can print arraylist without using any loop

        System.out.println(l1);
        // add an element at an index i

        l1.add(2, 59);
        System.out.println(l1);
        l1.add(2, 59);
        System.out.println(l1);
        // modifying an element at an index i
        l1.set(0, 9);
        System.out.println(l1);
        // removing an element at an index i
        l1.remove(1);
        System.out.println(l1);
        // removing an element by value anywhere in array (only one value will be
        // deleted who comes first in arraylist)
        l1.remove(Integer.valueOf(59));
        System.out.println(l1);
        // any method returns a boolean it was not found in arraylist
        System.out.println(l1.remove(Integer.valueOf(19)));
       //checking if an element exist or not
       boolean ans= l1.contains(Integer.valueOf(9));
       System.out.println(ans);
        // we can put any datatype in arraylist by creating new arraylist
        ArrayList x= new ArrayList<>();
        x.add("Siddhant");
        x.add(1);
        x.add(1.230);
        System.out.println(x);
        // int indexOf(0);
       
}
}