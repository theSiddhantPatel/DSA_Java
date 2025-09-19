// Minimum number of nodes in an AVL Tree with given height
package tree;

public class avlHeight {

    // Function to return
    // minimum number of nodes
    static int AVLtree(int H) {
        // Base Conditions
        if (H == 0)
            return 1;
        if (H == 1)
            return 2;

        // Tail Recursive Call
        return AVLtree(H - 1) + AVLtree(H - 2) + 1;
    }

    // Driver Code
    public static void main(String[] args) {
        int H = 5;
        int answer = AVLtree(H);

        // Output the result
        System.out.println("n(" + H + ") = " + answer);
    }
}