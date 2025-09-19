package cw54stacks;

public class lLimplenentation {
    public static class node {// user defined dara structure
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static class LLStack {
        node head = null;
        int size = 0;

        void push(int x) {
            node temp = new node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            int t = head.data;
            head = head.next;
            return t;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        void displayRecursive(node h) {
            if (h == null) {
                return;
            }
            displayRecursive(h.next);
            System.out.print(h.data + " ");
        }

        void display() {
            displayRecursive(head);
            System.out.println();
        }

        void displayRev() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() { // getter
            return size;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.displayRev();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }

}
