package neetcode.linkedlist;

import cracking.linkedlist.Node;

public class ReverseNodesInKGroup {
    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6))))));
        System.out.println(reverseKGroup(head, 3));

    }

    public static Node reverseKGroup(Node head, int k) {
        Node dummy = new Node(0, head);
        Node groupPrev = dummy;

        while (true) {
            Node kth = getKth(groupPrev, k);
            if (kth == null) {
                break;
            }

            Node groupNext = kth.next;

            Node prev = kth.next;
            Node curr = groupPrev.next;
            while (curr != groupNext) {
                Node tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            Node tmp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tmp;
        }
        return dummy.next;
    }

    public static Node getKth(Node curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
