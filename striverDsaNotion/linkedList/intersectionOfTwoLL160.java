package striverDsaNotion.linkedList;

public class intersectionOfTwoLL160 {
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null) {
            tempA = tempA.next;
            countA++;
        }
        int countB = 0;
        while (tempB != null) {
            tempB = tempB.next;
            countB++;
        }

        tempA = headA;
        tempB = headB;
        if (countA == countB) {
            while (tempA != null) {
                tempA = tempA.next;
                tempB = tempB.next;
                if (tempA == tempB)
                    return tempA;
            }
        } else if (countA > countB) {
            while (countA > countB) {
                tempA = tempA.next;
                countA--;

            }
            while (tempA != null) {
                tempA = tempA.next;
                tempB = tempB.next;
                if (tempA == tempB)
                    return tempA;
            }
        } else {
            while (countA < countB) {
                tempB = tempB.next;
                countB--;

            }
            while (tempA != null) {
                tempA = tempA.next;
                tempB = tempB.next;
                if (tempA == tempB)
                    return tempA;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);
        g.next = h;
        h.next = d;

        intersectionOfTwoLL160 x = new intersectionOfTwoLL160();
        System.out.println(x.getIntersectionNode(a, g));
        ;

    }
}
