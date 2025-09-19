package cw51LL;

//https://chatgpt.com/c/67b58616-5d40-8000-98cc-121d03829bb7
public class insertAtIndex0203 {
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

    public static node insertAtIndex(node head, int index, int value) {
        if (index < 0) {
            System.out.println("Invalid index");
            return head;
        }

        node newNode = new node(value);

        // Case 1: Insert at head (index 0)
        if (index == 0) {
            newNode.next = head;
            return newNode; // New head
        }
        node current = head; // to store head node
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        // Case 2: Index out of bounds
        if (current == null) {
            System.out.println("Index out of bounds");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(10);
        node c = new node(15);
        node d = new node(20);
        node e = new node(25);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        a = insertAtIndex(a, 0, 16);
        // Since Java follows pass-by-value, the head inside the function is just a
        // local copy of the reference. Modifying it inside the function does not affect
        // the original head in main().
        display(a);
    }
}


