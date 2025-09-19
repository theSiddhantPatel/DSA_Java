package cw51LL;

public class recPrintLl59 {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static void display(node head) {
        @SuppressWarnings("unused")
        node temp = head; // we create temp node to save head
        if (head == null)
            return;
        System.out.print(head.data + " ");
        display(head.next);

    }

    public static void countNode(node head,int count) {

        if (head == null) {
            System.out.println(count);
            return;
        }
        countNode(head.next, count += 1);
        // use count+=1 in recursive calls never use count++, it will give wrong answer

    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        countNode(a, 0);
        System.out.println();
        display(a);
    }

}
