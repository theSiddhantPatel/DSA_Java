package cw54stacks;

import java.util.Stack;

//stacks frames and values call by reference(permanent changes)
public class stackQues {
    public static void moveStackInAnotherStack(Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        System.out.println(st2);
    }

    public static void exactCopyOfStack(Stack<Integer> st) {
        // using an extra stack , space=O(n);
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        while (!st2.isEmpty()) {
            st3.push(st2.pop());
        }
        System.out.println(st3);
    }

    public static void insertAtBottom(Stack<Integer> st, int value) {
        // using an extra stack space O(n)
        // copy to another st2 ,
        // insert data in st;
        // copy all elements st2 to st again;
        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        st.push(value);
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
        // System.out.println(st);
    }

    public static void insertAtRandom(Stack<Integer> st, int index, int value) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > index) {
            temp.push(st.pop());
        }
        st.push(value);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }

    public static void displayStack(Stack<Integer> st) {
        // this code is related to how {sout(st)} function code works?
        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        while (!st2.isEmpty()) {
            int x = st2.pop();
            System.out.print(x + " ");
            st.push(x);
        }
    }

    public static void displayStackByArr(Stack<Integer> st) {
        int n = st.size();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
    }

    public static void displayRecursive(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int top = st.pop();
        displayRecursive(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void displayReverseRecursive(Stack<Integer> st) { // time 1h10m
        if (st.isEmpty())
            return;
        int top = st.pop();
        System.out.print(top + " ");// only matters when you print
        displayRecursive(st);
        st.push(top);
    }

    public static void pushAtBottomByRecursion(Stack<Integer> st, int value) {// video time 1h20m hw
        if (st.isEmpty()) {
            st.push(value);
            return;
        }
        int top = st.pop();
        pushAtBottomByRecursion(st, value);
        st.push(top);
    }

    public static void reverseStackRecursively(Stack<Integer> st) {
        if (st.isEmpty()||st.size()==1) {
            return;
        }
        int top = st.pop();
        reverseStackRecursively(st);
        insertAtBottom(st, top);
        st.push(top);
    }

    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // for (int i = st.size() - 1; i >= 0; i--) {
        // // printing in LIFO manner (non destructive)
        // System.out.print(st.get(i) + " ");
        // }
        // System.out.println();
        // System.out.println(st);
        // moveStackInAnotherStack(st);
        // exactCopyOfStack(st);
        // insertAtBottom(st, 10);
        // insertAtRandom(st, 0, 100);
        // displayStack(st);
        // displayStackByArr(st);
        // displayRecursive(st);
        // System.out.println(st);
        pushAtBottomByRecursion(st, 10);
        System.out.println(st);
        // reverseStackRecursively(st);

    }
}
