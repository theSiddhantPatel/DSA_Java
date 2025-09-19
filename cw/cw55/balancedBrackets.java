package cw.cw55;

import java.util.*;

// stack leetcode Ineterview questions
public class balancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else // str.charAt(i)==")"
            {
                if (st.isEmpty())
                    return false;
                else
                    st.pop();
            }

        }
        // if (st.isEmpty())
        // return true;
        // return false;
        // you can simply write this above condition as
        return st.isEmpty();
    }

    // https://leetcode.com/problems/valid-parentheses/
    public static boolean isBalanced2(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            } else // str.charAt(i)==")"
            {
                if (st.isEmpty())
                    return false;
                else if (str.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else if (str.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                } else if (str.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                } else
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str;
        try (Scanner s = new Scanner(System.in)) {
            str = s.next();
            // System.out.println(str);
        }
        // System.out.println(isBalanced(str));
        // System.out.println(isBalanced2(str));
        System.out.println(isBalanced(str));
    }

    // practice
    public static boolean isBalanced3(String str) {
        int n = str.length();
        Stack<Character> st3 = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                st3.push('(');
            } else {
                if (st3.isEmpty()) {
                    return false;
                } else
                    st3.pop();
            }
        }
        return st3.isEmpty();
    }

}
