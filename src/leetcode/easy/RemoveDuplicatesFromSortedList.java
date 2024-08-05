package leetcode.easy;


public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        deleteDuplicates(input);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        ListNode main = head.next;
        while (main != null) {
            if (main.val != prev.val) {
                prev.next = main;
                prev = main;
            }
            main = main.next;
        }
        prev.next = null;
        return head;
    }

    public static class ListNode {
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
