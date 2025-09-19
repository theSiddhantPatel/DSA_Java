package cw52;

// import java.lang.*;
// import java.lang.*;
// import java.lang.classfile.components.ClassPrinter;
// Definition for singly-linked list.
// import java.lang.classfile.components.ClassPrinter;

public class leetcodeLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // https://leetcode.com/problems/delete-node-in-a-linked-list/description/
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static ListNode findNthNodeFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return null; // Edge case: empty list or invalid n
        }
        // Step 1: Calculate the length of the list
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;

            count++;
        }
        // Step 2: Check if n is greater than the length of the list
        if (n > count) {
            return null; // Edge case: n is larger than the list length
        }
        // Step 3: Calculate the position from the beginning
        int target = count - n;
        // Step 4: Traverse to the target node
        curr = head;
        for (int i = 0; i < target; i++) {
            curr = curr.next;
        }
        return curr;
    }

    // find nth node from end in one traversal
    public static ListNode nthNode(ListNode head, int n) {
        ListNode fast;
        ListNode slow;
        fast = head;
        slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // Remove nth node from the end of the linkedlist
    public static ListNode removeNthNodeFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            display(head);
            return head;
            // returning head is a pass by reference solution for linked list.
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return slow;
    }

    // find Intersection of 2 linkedlist (video time 0h50m)
    public static ListNode intersectionOfLL(ListNode head1, ListNode head2) {
        int count1 = 0, count2 = 0;
        ListNode temp1 = head1, temp2 = head2;
        while (temp1 != null) {
            temp1 = temp1.next;
            count1++;
        }
        while (temp2 != null) {
            temp2 = temp2.next;
            count2++;
        }
        temp1 = head1;
        temp2 = head2;
        if (count1 > count2) {
            int steps = count1 - count2;
            for (int i = 0; i < steps; i++) {
                temp1 = temp1.next;
            }
        } else {
            int steps = count2 - count1;
            for (int i = 0; i < steps; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    // find middle element of linkedlist(video time 1h4m)
    // https://leetcode.com/problems/middle-of-the-linked-list/ right middle
    public static ListNode middleNodeOfLL(ListNode head) {
        // move fast at 2x and slow in x speed; when fast==null return slow
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // condition for right middle
        // if (fast.next == null)
        // return slow;
        // else
        // return slow.next;

        // condition for left middle
        if (fast.next != null && fast.next.next != null)
            return slow.next;
        else
            return slow;

    }

    // delete midddle element of ll(video time 1h27m)
    public static ListNode deleteMiddleNodeOfLL(ListNode head) {
        // condition for right middle and correct middle(in case of odd nodes) deletion
        if (head.next == null)
            return null;
        ListNode fast = head, slow = head;
        fast = fast.next; // for correct and right side middle deletion
        // while (fast.next != null && fast.next.next != null) {
        // fast = fast.next.next;
        // slow = slow.next;
        // }
        // slow.next = slow.next.next;
        // return head;

        // for left middle node deletion
        // first of all move fast to fast.next.next and then perform deletion
        if (fast.next == null) {
            fast.next = null;
            return fast;
        }
        fast = fast.next;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // cycle in a ll(video time 1h44m)
    public static boolean isCycleInLL(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
    /*
     * public boolean hasCycle(ListNode head) {
     * if (head == null || head.next == null) return false; // No cycle possible
     * ListNode slow = head;
     * ListNode fast = head;
     * while (fast != null && fast.next != null) {
     * slow = slow.next; // Moves 1 step
     * fast = fast.next.next; // Moves 2 steps
     * if (slow == fast) { // Cycle detected
     * return true;
     * }
     * }
     * return false; // No cycle found
     * }
     */

    // find out the node where the cycle begins(video time 2h01m)
    public static ListNode cycleBeginNodeInLL(ListNode head) {
        // same as isCycleInLL , but here when slow==fast we return slow.next at this
        // time. bcz this is the node where cycle begins.
        ListNode fast = head, slow = head;

        if (fast == null || fast.next == null)
            return null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return slow;

    }

    // merge 2 sorted linked list (video time 2h19m)
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null)
            temp.next = temp2;
        else
            temp.next = temp1;
        return head.next;
    }

    // merge 2 sorted linked list with O(1) space (video time 2h35m)
    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(-100);
        ListNode temp = head;
        while (temp1.next != null && temp2.next != null) {
            if (temp1.val < temp2.val) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if (temp2 == null)
            temp.next = temp1;
        else
            temp.next = temp2;
        return head.next;
    }

    // split linkedList in even odd add odd nodes in last (video time 2h47m)
    public static ListNode splitListInEvenOdd(ListNode head) {
        if (head == null)
            return null; // Edge case: empty list
        ListNode evenHead = new ListNode(0); // Dummy node for even list
        ListNode oddHead = new ListNode(0); // Dummy node for odd list
        ListNode even = evenHead, odd = oddHead;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val % 2 == 0) {
                even.next = temp;
                even = even.next;
            } else {
                odd.next = temp;
                odd = odd.next;
            }
            temp = temp.next;
        }
        even.next = oddHead.next; // Connect even list to odd list
        odd.next = null; // End the list properly
        return evenHead.next; // Return the head of the even list
    }

    // remove duplicates from a sorted linked list
    public static ListNode uniqueNodesInSortedLl(ListNode head) {
        ListNode temp = head;
        // ListNode newNode = temp;
        int check = temp.val;
        while (temp.next != null) {
            temp = temp.next;

            while (temp != null && check == temp.val) {
                temp = temp.next;
            }
            if (temp != null) {
                check = temp.val;
                // newNode.next = temp;
                // newNode = newNode.next;
            }
        }
        // newNode.next = null;
        return head;

    }

    public static ListNode uniqueNodesInSortedLl2(ListNode head) {
        if (head == null)
            return null;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;

    }

    // Reverse a linked list (recursive approach),O(n) space video time(3h3m)
    public static ListNode reverseLl(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newNode = reverseLl(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }

    // Reverse a linked list (iterative approach),O(1) space video time(3h43m)
    public static ListNode reverseLl2(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward;
        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    // palindrome LinkedList video time(3h54m)
    public static boolean isPalindromeLl(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) { // left middle
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode temp = reverseLl2(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while (p2 != null) {
            if (p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    // maximum twin sum of linked list video time (4h8m) leetcode question no. 2130
    public static int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode temp = head;
        int max = Integer.MIN_VALUE;
        while (prev != null) {
            max = Math.max(max, prev.val + temp.val);
            prev = prev.next;
            temp = temp.next;
        }
        return max;
    }

    // odd even linked list (leetcode 328) video 4h14m
    public static ListNode oddEven(ListNode head) {
        ListNode tempOdd = new ListNode(0);
        ListNode tempEven = new ListNode(0);
        ListNode odd = tempOdd, even = tempEven, temp = head;
        while (temp != null) {
            tempOdd.next = temp;
            temp = temp.next;
            tempOdd = tempOdd.next;

            if (temp != null) {
                tempEven.next = temp;
                temp = temp.next;
                tempEven = tempEven.next;
            }
        }
        tempOdd.next = even.next;
        tempEven.next = null;
        return odd.next;
    }

    // copy list with random pointer(leetcode 138) video time (4h33m)
    // helper class(deep copy of Linked list creation)
    // this program would completed in 4 steps
    // 1. create deep copy of list
    public static ListNode deepCopy(ListNode head) {
        ListNode current = new ListNode(0), dummy = current, temp = head;
        while (temp != null) {
            current.next = new ListNode(temp.val);
            temp = temp.next;
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(15);
        ListNode d = new ListNode(20);
        ListNode e = new ListNode(25);
        ListNode f = new ListNode(30);
        ListNode g = new ListNode(55);
        ListNode h = new ListNode(40);
        // ListNode i = new ListNode(45);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        // h.next = i;

        // System.out.println(nthNode(a, 2).val);
        // ListNode k = a;
        // while (k != null) { // display a linkedlist
        // System.out.print(k.val + " ");
        // k = k.next;
        // }
        // System.out.println();
        // display(a);
        // System.out.println(removeNthNodeFromEnd(a, 1).val);
        // display(a);
        // display(a);
        // display(f);
        // System.out.println(intersectionOfLL(a, f).val);
        // System.out.println(middleNodeOfLL(a).val);
        // deleteMiddleNodeOfLL(a);
        // display(a);
        // System.out.println(isCycleInLL(a));
        // System.out.println(cycleBeginNodeInLL(a).val);
        // display(mergeTwoLists2(a, e));
        // display(splitListInEvenOdd(a));\
        // uniqueNodesInSortedLl(a);
        // display(a);
        // display(uniqueNodesInSortedLl(a));
        // display(reverseLl(a));
        // display(reverseLl2(a));
        // System.out.println(isPalindromeLl(a));
        // System.out.println(pairSum(a));
        // System.out.println();
        // display(oddEven(a));
        display(reverseLl2(a));

    }
}
