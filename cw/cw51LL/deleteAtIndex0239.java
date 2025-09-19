package cw51LL;

public class deleteAtIndex0239 {

    public static class node {

        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    public static void display(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static node deleteAt(node head, int index) {
        int count = 0;
        node current = head;
        if (index == 0) {
            head = head.next;
            return head;
        }
        while (count != index - 1) {
            current = current.next;
            count++;
            if (current == null) {
                System.out.println("invalid index for delete");
                return head;
            }
        }
        current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
       a= deleteAt(a, 0);
        display(a);
       b= deleteAtIndex0239.deleteAt(b,0);
        deleteAtIndex0239.display(a);

    }
}
