package leetcode.easy;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int firstLength = 0;
        int secondLength = 0;

        ListNode runner1 = headA;
        ListNode runner2 = headB;

        while (runner1 != null || runner2 != null) {

            if (runner1 != null) {
                firstLength++;
                runner1 = runner1.next;
            }
            if (runner2 != null) {
                secondLength++;
                runner2 = runner2.next;
            }
        }

        int count = Math.abs(firstLength - secondLength);

        while (count != 0) {
            if (firstLength > secondLength) {
                headA = headA.next;
            } else {
                headB = headB.next;
            }

            count--;
        }

        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }

        return null;
    }
}
