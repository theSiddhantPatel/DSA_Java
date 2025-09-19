package cw51LL;

public class getElementAtIndex0223 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print("\n");// new line

    }

    public static void getAtIndex(Node head, int index) {
        int count = 0;
        Node current = head;
        while (count != index) {
            current = current.next;
            count++;
            if (current == null) {
                System.out.println("invalid index");
                return;
            }
        }
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        Node a = new Node(10);
        Node b = new Node(15);
        Node c = new Node(20);
        Node d = new Node(25);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        display(head);
        getAtIndex(head, 4 );

    }
}
