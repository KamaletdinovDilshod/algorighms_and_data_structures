package leetcode.medium;


public class RotateList {
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
        printAll(rotateRight(list, 2000000000));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode last = head;
        ListNode prev = null;
        int size = size(last, 0);
        int count;
        if (k >= size) {
            count = k % size;
        } else {
            count = size - k;
        }
        while (count > 0) {
            while (last.next != null) {
                prev = last;
                last = last.next;
            }
            prev.next = null;
            last.next = head;
            head = last;
            count--;
        }
        return head;
    }

    public static int size(ListNode last, int s) {
        while (last != null) {
            last = last.next;
            s++;
        }
        return s;
    }

    public static void printAll(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();
    }
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
