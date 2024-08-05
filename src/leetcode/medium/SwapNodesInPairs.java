package leetcode.medium;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        ListNode prev = head;
        ListNode second = head.next;
        while (prev.next != null && second.next != null) {
            int temp = prev.val;
            prev.val = second.val;
            second.val = temp;

            prev = second.next;
            second = prev.next;
        }
        if (second != null) {
            int temp = prev.val;
            prev.val = second.val;
            second.val = temp;
        }
        return head;
    }


    public class ListNode {
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
