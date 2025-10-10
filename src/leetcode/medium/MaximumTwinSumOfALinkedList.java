package leetcode.medium;


public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {
        pairSum(null);
    }

    public static int pairSum(ListNode head) {
        int max = 0;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode nxt = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nxt;
        }

        while (prev != null && head != null) {
            max = Math.max(head.val + prev.val, max);
            head = head.next;
            prev = prev.next;
        }

        return max;

    }


}
