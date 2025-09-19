package cw54stacks;

import java.util.*;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.size());
        st.push(4);
        st.push(5);

        int a = st.peek(); // it returns the top most value of stack
        // LIFO
        // FILO
        System.out.println(a);
        st.pop();
        System.out.println(st);
        // size of stack
        int count = 0;
        while (!st.isEmpty()) { // means while(st.size()>0){...}
            st.pop();
            count++;
        }
        System.out.println(count);
    }
}
