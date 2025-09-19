package cw65binaryTree;

//https://youtu.be/ThQ7dGtBdAE?feature=shared&t=2205
public class t036treeImplementation {

    // t036 means time in video watch video at 0 hour and 36 minute
    public static class node {

        int val;
        node left;
        node right;

        public node(int val) {
            this.val = val;
        }
    }

    public static void display(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " -> ");
        if (root.left != null)
            System.out.print(root.left.val + ", ");
        else
            System.out.print("n, ");
        if (root.right != null)
            System.out.print(root.right.val + ", ");
        else
            System.out.print("n, ");
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        node root = new node(2);
        node a = new node(4);
        node b = new node(10);
        root.left = a;
        root.right = b;
        node c = new node(6);
        node d = new node(5);
        a.left = c;
        a.right = d;
        node e = new node(11);
        b.right = e;
        display(root);
    }
}
