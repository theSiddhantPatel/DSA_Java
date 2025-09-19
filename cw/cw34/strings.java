package cw34;

import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();  // prints one character
        // System.out.println(a);
        String b = s.nextLine(); //prints a line
        System.out.println(b);
        // char ch =s.charAt(0); //
        for (int i = 0; i < b.length(); i++) {
            System.out.print(b.charAt(i)+" ");
        }
        System.out.println();
        System.out.println(a.substring(2, 5));
        String str1="welcome" ;
        System.out.println(str1.length());      

    }
    
}
