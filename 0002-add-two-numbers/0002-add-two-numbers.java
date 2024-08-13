/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode result = head;
        int inMind = 0;
        int sumResult;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                sumResult = l1.val + l2.val + inMind;
                result.next = (l1.next == null && l2.next == null) ? null : new ListNode();
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                sumResult = l2.val + inMind;
                result.next = (l2.next == null) ? null : new ListNode(0);
                l2 = l2.next;
            } else {
                sumResult = l1.val + inMind;
                result.next = (l1.next == null) ? null : new ListNode(0);
                l1 = l1.next;
            }

            if (sumResult > 9) {
                sumResult = sumResult % 10;
                inMind = 1;
            } else {
                inMind = 0;
            }
            result.val = sumResult;
            if (result.next == null && inMind == 1) result.next = new ListNode(1);
            result = result.next;
        }
        return head;
    }
}