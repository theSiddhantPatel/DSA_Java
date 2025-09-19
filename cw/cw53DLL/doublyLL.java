package cw53DLL;

public class doublyLL {
    public static class node {
        int val;
        node next;
        node prev;

        node(int val) {
            this.val = val;
        }

    }

    public static void display(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void revDisplay(node tail) {
        while (tail != null) {
            System.out.print(tail.val + " ");
            tail = tail.prev;
        }
        System.out.println();
    }

    public static void displayLLbyRandomNode(node random) {
        node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void revDisplayLLbyRandomNode(node random) {
        node temp = random;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static node insertionAtHead(node head, int x) {
        node temp = new node(x);
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    public static node insertAtTail(node head, int x) {
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node a = new node(x);
        temp.next = a;
        a.prev = temp;
        return head;
    }

    public static void insertAtAnywhere(node head, int index, int x) {
        node s = head;
        for (int i = 0; i < index - 1; i++) {
            s = s.next;
        }
        node r = s.next;
        node t = new node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static node deleteAnyNode(node head, int index) {
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return head;
    }

    public static void main(String[] args) {
        node a = new node(4);
        node b = new node(10);
        node c = new node(2);
        node d = new node(99);
        node e = new node(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        // display(a);
        // revDisplay(e);
        // displayLLbyRandomNode(d);
        // revDisplayLLbyRandomNode(c);
        // display(insertionAtHead(a, 1));
        // display(insertAtTail(a, 50));
        insertAtAnywhere(a, 2, 19);
        display(a);

    }
}
