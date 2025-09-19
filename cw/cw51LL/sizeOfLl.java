package cw51LL;

// import java.util.*;
@SuppressWarnings("resource")
public class sizeOfLl {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }

    }

    static int count = 0;

    public static void display(node head) {
        // node temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        // display(a);
        // display(b);
        // display(c);
        // System.out.println(a.next);
        a.next = b;
        b.next = c;
        c.next = new node(4);
        display(a);
        System.out.println("total nodes in ll is " + count);

    }
}
