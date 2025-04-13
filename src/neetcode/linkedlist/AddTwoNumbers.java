package neetcode.linkedlist;

import cracking_the_coding_interview.linkedlist.Node;

public class AddTwoNumbers {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node();
        Node runner = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int value = 0;
            if (l1 != null) {
                value += l1.data;
            }

            if (l2 != null) {
                value += l2.data;
            }

            if (carry != 0) {
                value += carry;
            }

            carry = value >= 10 ? 1 : 0;

            runner.next = new Node(value % 10);
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            runner = runner.next;
        }
        return dummy.next;
    }
}
