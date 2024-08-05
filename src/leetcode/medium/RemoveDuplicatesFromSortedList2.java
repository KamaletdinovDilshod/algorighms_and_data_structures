package leetcode.medium;


public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode(0, head);
        ListNode pred = sentinel;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                pred.next = head.next;
            } else {
                pred = pred.next;
            }
            head = head.next;
        }
        return sentinel.next;
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> dup = new HashSet<>();
//        ListNode temp = head;
//        while (temp != null) {
//            if (!set.contains(temp.val)) {
//                set.add(temp.val);
//            } else dup.add(temp.val);
//            temp = temp.next;
//        }
//        ListNode newNode = new ListNode(-1);
//        ListNode newHead = newNode;
//        ListNode iter = head;
//        while (iter != null) {
//            if (!dup.contains(iter.val)) {
//                newNode.next = iter;
//                newNode = newNode.next;
//            }
//            iter = iter.next;
//        }
//        newNode.next = null;
//        return newHead.next;
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
