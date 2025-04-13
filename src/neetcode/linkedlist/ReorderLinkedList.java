package neetcode.linkedlist;

import cracking_the_coding_interview.linkedlist.Node;

public class ReorderLinkedList {
    public void reorderList(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        Node prev = slow.next = null;
        System.out.println(prev);
        while (second != null) {
            Node next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        Node first = head;
        second = prev;
        while (second != null) {
            Node next1 = first.next;
            Node next2 = second.next;
            first.next = second;
            second.next = next1;
            first = next1;
            second = next2;
        }
    }
}
