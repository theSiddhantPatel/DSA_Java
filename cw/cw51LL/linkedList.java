package cw51LL;

public class linkedList {
    public static class node {
        int data; // value
        node next; // address of next node

        node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        node x = new node(6);
        node y = new node(16);
        node z = new node(26);
        node w = new node(36);
        x.next = y;
        y.next = z;
        z.next = w;
        w.next = null;
        System.out.println(x.data);
        System.out.println(x.next.data);
        System.out.println(y.data);
        System.out.println(y.next.data);

    }

}
