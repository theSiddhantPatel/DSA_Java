package cw54stacks;

import java.util.Stack;

public class overFlowNunderFlow {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st);
        // st.pop();           //stack underflow error
        // st.peek();      //stack underflow error
        // System.out.println(st);
        
    }
}
