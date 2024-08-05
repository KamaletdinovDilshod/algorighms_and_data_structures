package leetcode.medium;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode greater = new ListNode(0);
        ListNode grit = greater;
        ListNode ans = new ListNode(-1, head);
        ListNode smaller = ans;
        while (head != null) {
            if (head.val < x) {
                smaller.next = head;
                smaller = smaller.next;
            } else {
                grit.next = head;
                grit = grit.next;
            }
            head = head.next;
        }
        grit.next = null;
        smaller.next = greater.next;
        return ans.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
