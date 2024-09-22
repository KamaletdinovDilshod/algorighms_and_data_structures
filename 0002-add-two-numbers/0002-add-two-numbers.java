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
        go(head, null, l1, l2, 0);
        return head;
    }

    public static void go(ListNode target, ListNode prev, ListNode l1, ListNode l2, int inMind) {
        if (l1 != null & l2 != null) {
            int sum = l1.val + l2.val + inMind;
            target.val = (sum > 9) ? sum % 10 : sum;
            target.next = (l1.next == null && l2.next == null) ? null : new ListNode();
            go(target.next, target, l1.next, l2.next, (sum > 9) ? 1 : 0);
        } else if (l1 != null) {
            int sum = l1.val + inMind;
            target.val = (sum > 9) ? sum % 10 : sum;
            target.next = (l1.next == null) ? null : new ListNode();
            go(target.next, target, l1.next, null, (sum > 9) ? 1 : 0);
        } else if (l2 != null) {
            int sum = l2.val + inMind;
            target.val = (sum > 9) ? sum % 10 : sum;
            target.next = (l2.next == null) ? null : new ListNode();
            go(target.next, target, null, l2.next, (sum > 9) ? 1 : 0);
        } else {
            if ((prev.val == 0 && inMind == 1) || inMind == 1) prev.next = new ListNode(1);
        }
    }

}