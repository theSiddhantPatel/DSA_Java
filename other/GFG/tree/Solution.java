// public class solution {
    // class Node {
    //     int data;
    //     Node left, right;

    //     public Node(int data) {
    //         this.data = data;
    //         this.left = this.right = null;
    //     }
    // }

import tree.Node;

public class Solution {
        Node root;
        Node head, tail;

        // Function to convert binary tree to doubly linked list
        public void convertToDLL(Node node) {
            if (node == null) {
                return;
            }

            // Convert left subtree
            convertToDLL(node.left);

            // Process current node
            if (head == null) {
                head = tail = node; // Initialize head and tail
            } else {
                tail.right = node; // Link current node to the DLL
                node.left = tail;
                tail = node; // Update tail
            }

            // Convert right subtree
            convertToDLL(node.right);
        }

        // Function to print the doubly linked list
        public void printDLL() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.right;
            }
        }

        public static void main(String[] args) {
           Solution tree = new Solution();
            tree.root = new Node(10);
            tree.root.left = new Node(12);
            tree.root.right = new Node(15);
            tree.root.left.left = new Node(25);
            tree.root.left.right = new Node(30);
            tree.root.right.left = new Node(36);
            // tree.root.right.right = new Node(39);

            tree.convertToDLL(tree.root);
            tree.printDLL(); // Output: 25 12 30 10 36 15
        }
    }

// }

    // }
