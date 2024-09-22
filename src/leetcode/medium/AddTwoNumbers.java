package leetcode.medium;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(9, new ListNode(5));
        ListNode list2 = new ListNode(1, new ListNode(8, new ListNode(3, new ListNode(6))));
        ListNode result = addTwoNumbers(list1, list2);
        printAll(result);
    }

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


    public static void printAll(ListNode list) {
        if (list == null) return;
        System.out.print(list.val);
        if (list.next != null) {
            System.out.print(", ");
            printAll(list.next);
        } else {
            System.out.println();
        }
    }

}

