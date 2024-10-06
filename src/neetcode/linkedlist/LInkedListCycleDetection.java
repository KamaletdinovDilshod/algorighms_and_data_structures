package neetcode.linkedlist;

import cracking.linkedlist.Node;

public class LInkedListCycleDetection {
    public boolean hasCycle(Node head) {
        Node fast = head.next;
        Node slow = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;

    }
}
