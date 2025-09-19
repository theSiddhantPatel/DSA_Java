package tree;

public class day83mirrorTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void swap(Node a, Node b) {// for swapping tree childs data
        Node temp = a; // int temp = node.left.data;
        a = b; // node.left.data = node.right.data;
        b = temp; // node.right.data = temp;

        /*
         * The issue with your swap function* is that it does not actually
         * swap the left andright children of the node in the tree. This is because in
         * Java is pass-by-value, and your function is only swapping the local
         * references (a and b), not the actual left and right children of the node in
         * the tree.
         */

        // When you call swap(node.left, node.right), the local variables a and b are
        // swapped, but the actual node.left and node.right in the tree remain
        // unchanged.

        /*
         * To fix this, you need to modify the swap function so that it directly swaps
         * the left and right children of the node. Instead of passing node.left and
         * node.right as separate arguments, pass the node itself and swap its children
         */
    }

    public static void swap(Node node) {
        Node temp = node.left; // Store the left child in a temporary variable
        node.left = node.right; // Set the left child to the right child
        node.right = temp; // Set the right child to the temporary variable
    }

    public static void mirror(Node node) {
        // Your code here
        // https: // chat.deepseek.com/a/chat/s/f4f256d4-91ac-44aa-8b08-e4bbf7e429cd
        if (node == null) {
            return;
        }
        swap(node);
        mirror(node.left);
        mirror(node.right);

    }

    public static void preorder(Node root) {
        // preorder - root left right
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        Node f = new Node(30);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        preorder(a);
        System.out.println();
        mirror(a);
        preorder(a);
    }

}