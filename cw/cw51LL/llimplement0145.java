package cw51LL;

public class llimplement0145 {
    public static class Node {
        int data;
        Node next;

        public Node(int val) {
            data = val;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else
                tail.next = temp;
            tail = temp;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            // tail=temp;
        }

        void insertAtIndex(int val, int index) {
            Node temp = head;
            Node insert = new Node(val);
            if (index == 0) {
                insert.next = head;
                head = insert;
                return;
            }
            if (index == size()) {
                insertAtEnd(val);
                return;
            }
            int count = 1;
            while (count < index && temp.next != null) {
                temp = temp.next;
                count++;
            }
            insert.next = temp.next;
            temp.next = insert;
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }

        void deleteAtIndex(int index) {

            Node temp = head;
            if (index == 0) {
                head = head.next;
                return;
            }
            int count = 1;
            while (count < index) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;

        }

        void display() {
            Node temp = head;// to preserve the head create a new node
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtHead(30);
        ll.insertAtIndex(5, 5);
        ll.display();
        System.out.println();
        // System.out.println(ll.tail.data);
        ll.deleteAtIndex(0);
        ll.display();
    }
}
