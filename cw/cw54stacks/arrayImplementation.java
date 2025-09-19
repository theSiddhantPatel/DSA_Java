package cw.cw54stacks;

public class arrayImplementation {
    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            arr[idx++] = x;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isfull() {
            if (idx == arr.length) {
                return true;
            }
            return false;
        }

        void capacity() {
            System.out.println(arr.length);
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.isfull());
        st.capacity();

    }
}
