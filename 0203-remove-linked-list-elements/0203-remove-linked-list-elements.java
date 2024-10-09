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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0);
        ListNode prev = ans;
        if (head == null) return head;
        while(head != null) {
            if (head.val == val){
                prev.next = head.next;
                head = head.next;
            } else {
                prev.next = head;
                head = head.next;
                prev = prev.next;
            }
        }
        return ans.next;
    }
}