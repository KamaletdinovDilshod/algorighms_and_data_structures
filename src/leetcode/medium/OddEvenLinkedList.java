package leetcode.medium;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode ln = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(oddEvenList(ln));
    }

    public static ListNode oddEvenList(ListNode head) {

        // base case
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;

            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
