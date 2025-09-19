package striverDsaNotion.linkedList;

public class removeNthNodefromEnd19 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (n == count) {
            head = head.next;
            return head;
        }

        int target = count - n;
        temp = head;
        while (target > 1) {
            target--;
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    // delete Nth node from end in single traversal
    public static ListNode deleteNthNodeFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println();
        a = removeNthFromEnd(a, 5);
        display(a);

    }
}
