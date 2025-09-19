package LinkedList;
// import java.util.*;
public class day66RotateALinkedList {
    // https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/rotate-a-linked-list
    // Steps:1)Check if
    // the list
    // is empty, has
    // one node, or
    // k is
    // zero.Return the head if
    // any condition is true.

    // 2)
    // Traverse the
    // list to
    // calculate its length.

    // 3)
    // Compute effective
    // rotations using k%length.

    // 4)Connect the
    // last node
    // to the
    // head to
    // form a
    // circular list.

    // 5)
    // Find the new
    // tail node
    // after k (I think it should be k-1 steps)
    // steps from
    // the head, and
    // set the new
    // head to newTail.next.

    // 6)
    // Break the
    // circular link
    // by setting
    // newTail.next to null.

    // 7)
    // Implement printList
    // to print
    // the linked list.

    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        // Compute the length of the linked list
        int length = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        // Calculate the effective rotations needed
        k = k % length;
        if (k == 0) {
            return head;
        }
        // Make the linked list circular
        current.next = head;
        // Find the new head and tail
        Node newTail = head;
        for (int i = 1; i < k; i++) {
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null; // Break the cycle
        return newHead;
    }
    public static void main(String[] args) {
        // node head=new node;
    }

}
