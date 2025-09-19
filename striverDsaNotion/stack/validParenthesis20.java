package striverDsaNotion.stack;

import java.util.*;

public class validParenthesis20 {
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
}
