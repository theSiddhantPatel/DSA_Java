package LinkedList;



    class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class ll2 {
        public static void main(String[] args) {
            // Creating the head of the linked list
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);

            // Print the linked list
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
