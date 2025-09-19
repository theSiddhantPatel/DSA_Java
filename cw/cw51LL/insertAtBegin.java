package cw51LL;

public class insertAtBegin {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static node insertBegin(node head, int data) {
        node newNode = new node(data);
        newNode.next = head;
        return newNode;
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        a.next = b;
        b.next = c;
        display(a);
        System.out.println();
        insertBegin(a, 40);
        display(a);

    }

}
