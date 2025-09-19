package striverDsaNotion.Recursion_Backtracking.codeStoryWithMIK;

import java.util.*;

public class l6 {
    // reverse a stack
    public static Stack<Integer> reverseAstack(Stack<Integer> stack) {
        Stack<Integer> stack2 = new Stack<>();
        while (stack.size() > 0) {
            int x = stack.pop();
            stack2.push(x);
            // System.out.println(stack2);
        }
        return stack2;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverseAstack(st);
        System.out.println(st.size());
        System.out.println(st);
    }
}
