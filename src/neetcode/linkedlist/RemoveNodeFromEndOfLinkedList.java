package neetcode.linkedlist;

import cracking.linkedlist.Node;

public class RemoveNodeFromEndOfLinkedList {
    public Node removeNthFromEnd(Node head, int n) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < n + 1; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }
        
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p2.next != null) {
            p2.next = p2.next.next;
        }
        return head;
    }
}
