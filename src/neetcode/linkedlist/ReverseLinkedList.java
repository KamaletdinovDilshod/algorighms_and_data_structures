package neetcode.linkedlist;

import cracking_the_coding_interview.linkedlist.Node;

public class ReverseLinkedList {
    public Node reverseLinkedList(Node list) {
        Node prev = null;
        Node curr = list;
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    // Recursive solution
    static Node reverseList(Node head) {
        if (head == null || head.next == null) return head;

        // Reverse the rest of the list
        Node revHead = reverseList(head.next);

        // Make the current head the last node
        head.next.next = head;

        // Update the next of current head to NULL
        head.next = null;

        //Return the new head of the reversed list
        return revHead;
    }
}
