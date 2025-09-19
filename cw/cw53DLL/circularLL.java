package cw53DLL;

import java.util.*;

public class circularLL { // video time (1h0m)
    public static class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
        }

    }

    public static void display(node head) {
        System.out.print(head.data + " ");
        node temp = head.next;
        // by this formula you can start printing a circular LL completely from any
        // given node
        while (temp != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static node deleteHeadNodeInCLL(node head) {
        node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        return head;
    }

    public static void circularDLL(node head) {
        // creation of circular ll to circular dll
        // tail.next=head;
        // head.prev=tail;
    }

    public static void checkPalindromeInCDLL(node head) {
        if (head == null || head.next == head) {
            System.out.println("palindrome");
            return;
        }
        node tail = head;
        while (tail.next != head) {
            tail = tail.next;
        }
        boolean isPalindrome = true;
        node start = head;
        node end = tail;
        while (start != end && start.prev != end) {
            if (start.data != end.data) {
                isPalindrome = false;
                break;
            }
            start = start.next;
            end = end.prev;
        }
        System.out.println(isPalindrome ? "Palindrome" : "not Palindrome");

    }

    public static void twoSumInASortedDll(node head, int target) {
        // video time1h16m
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node start = head;
        node end = temp;
        boolean flag = false;
        while (start.data < end.data) {
            if (start.data + end.data == target) {
                flag = true;
                break;
            } else if (start.data + end.data > target) {
                end = end.prev;
            } else
                start = start.next;
        }
        System.out.println(flag ? "yes! target found" : "not found");
    }

    public static void CriticalPointMaxMinDistance(node head) {// video time 1h22m
        // if a node is grater is greater or lesser than their neighbours, then this is
        // called critical point
        // local maxima and minima
        if (head == null || head.next == null || head.next.next == null) {
            System.out.println(">2 nodes are required for max-min");
            return;
        }
        List<Integer> criticalIndices = new ArrayList<>();
        node Prev = head;
        node curr = head.next;
        node Next = curr.next;
        int index = 1;
        while (Next != null) {
            if ((curr.data > Prev.data && curr.data > Next.data) || (curr.data < Prev.data && curr.data < Next.data)) {
                criticalIndices.add(index);
            }
            Prev = curr;
            curr = Next;
            Next = Next.next;
        }
        if (criticalIndices.size() < 2) {
            System.out.println("Not enough critical points to calculate distance");
            return;
        }
        int minDist = Integer.MAX_VALUE;
        for (int i = 1; i < criticalIndices.size(); i++) {
            minDist = Math.min(minDist, criticalIndices.get(i) - criticalIndices.get(i - 1));
        }
        int maxDist = criticalIndices.get(criticalIndices.size() - 1) - criticalIndices.get(0);

        System.out.println("Minimum distance between critical points: " + minDist);
        System.out.println("Maximum distance between critical points: " + maxDist);
    }

    public static class Node {
        int data;
        Node next;
        Node prev;
        Node child;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node flatten(Node head) { // leetcode 430
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;
            if (temp.child != null) {
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                while (c.next != null) {
                    c = c.next;
                    if (t != null)
                        t.prev = c;
                }
            }
            temp.child = null;// in last remove all child nodes
            temp = t;
        }
        return head;
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(6);
        node c = new node(5);
        node d = new node(4);
        node e = new node(9);
        node f = new node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        f.prev = e;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        a.prev = null;
        // display(a);
        // display(deleteHeadNodeInCLL(a));
        // checkPalindromeInCDLL(a);
        // twoSumInASortedDll(a, 7);
        CriticalPointMaxMinDistance(a);

    }

}
