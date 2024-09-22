package leetcode.medium;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2));
        System.out.println(removeNthFromEnd(listNode, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode runner = head;
        int length = findLength(head);
        int remPos = length - n;
        if (remPos == 0) {
            return head.next;
        }
        for (int i = 0; i < remPos - 1; i++) {
            runner = runner.next;
        }
        runner.next = runner.next.next;
        return head;
    }

    public static int findLength(ListNode runner) {
        int i = 0;
        while (runner != null) {
            runner = runner.next;
            i++;
        }
        return i;
    }
}
