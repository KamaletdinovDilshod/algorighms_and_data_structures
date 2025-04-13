package cracking_the_coding_interview.linkedlist;

public class DeleteMiddleNode {

    static Node deleteMiddleNode(Node n) {
        Node p1 = n;
        Node p2 = n;
        int length = 0;
        while (p1 != null) {
            length++;
            p1 = p1.next;
        }

        for (int i = 0; i < (length / 2) - 1; i++) {
            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return n;
    }

    // Solution 2
    static Node deleteMid2(Node head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node prev = null;
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            prev = slowPtr;
            slowPtr = slowPtr.next;
        }
        prev.next = slowPtr.next;
        return head;
    }
}
