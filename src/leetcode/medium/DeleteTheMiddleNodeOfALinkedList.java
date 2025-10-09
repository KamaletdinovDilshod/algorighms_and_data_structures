package leetcode.medium;

import static java.lang.StrictMath.ceil;

public class DeleteTheMiddleNodeOfALinkedList {

    public static void main(String[] args) {
        System.out.println(ceil(4.5) == 5);
    }

    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) return null;

        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;
    }
}


