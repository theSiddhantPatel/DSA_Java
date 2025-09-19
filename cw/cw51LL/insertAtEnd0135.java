package cw51LL;

public class insertAtEnd0135 {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static void display(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }

    public static node insertAtLast(node head, int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;

        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;

    }

    public static int llsize(node head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(3);
        node c = new node(89);
        a.next = b;
        b.next = c;
        c.next = null;
        // insertAtLast(a, 6);
        display(a);
        System.out.println("size is " + llsize(a));

        insertAtLast(a, 6);
        System.out.println();
        display(a);
        System.out.println("size is " + llsize(a));

    }

}
