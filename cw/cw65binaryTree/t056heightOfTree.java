package cw65binaryTree;

import java.util.*;
import java.io.*;
// import deepseek;

@SuppressWarnings("unused")
public class t056heightOfTree {
    static int size = 0;

    public static class node {
        int val;
        node left;
        node right;

        public node(int val) {
            this.val = val;
        }
    }

    public static void preorder(node root) {
        // preorder - root left right
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        size++;
        preorder(root.left);
        preorder(root.right);
    }

    public static int sizeOfTree(node root) {
        if (root == null)
            return 0;
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }

    public static int sumOfAllTreeNodes(node root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        return sum += root.val + sumOfAllTreeNodes(root.left) + sumOfAllTreeNodes(root.right);

    }

    public static int maxValueOfTree(node root) {

        if (root == null) {
            return Integer.MIN_VALUE;
            // return 0 will give wrong ans in case of -ve node
        }
        int max = root.val;
        int leftMax = maxValueOfTree(root.left);
        int rightMax = maxValueOfTree(root.right);
        return (Math.max(max, (Math.max(leftMax, rightMax))));
        // you can simply write
        // return
        // Math.max(root.val,Math.max(maxValueOfTree(root.left),maxValueOfTree(root.right)));
    }

    public static int heightOfTree(node root) {
        if (root == null) // only,this condition gives levev order height
            return 0;
        if (root.left == null && root.right == null) {
            // this condition gives edge height
            return 0;
        }
        // you can write simply both condition
        // if(root == null ||(root.left == null && root.right ==null))
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
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

        // preorder(root);
        // System.out.println("size is " + size); // it also prints size of tree but
        // t.c. is high
        // System.out.println("sizeOfTree is " + sizeOfAllTree(root));
        // System.out.println(sumOfAllTreeNodes(root));
        // System.out.println(maxValueOfTree(root));
        node f = new node(8);
        e.left = f;
        System.out.println(heightOfTree(root));
    }
}
