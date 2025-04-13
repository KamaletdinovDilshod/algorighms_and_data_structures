package cracking_the_coding_interview.linkedlist;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Node ll = new Node(1, new Node(2, new Node(2, new Node(1, null))));
        System.out.println(isPalindrome3(ll));
    }

    boolean isPalindrome(Node list) {
        Node reversed = reverseAndClone(list);
        return isEqual(list, reversed);
    }

    Node reverseAndClone(Node node) {
        Node head = null;

        while (node != null) {
            Node n = new Node(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }

        return head;
    }

    boolean isEqual(Node one, Node two) {
        while (one != null && two != null) {
            if (one.data != two.data) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }

    // Solution 2
    boolean isPalindrome2(Node head) {
        Node fast = head;
        Node slow = head;

        Stack<Integer> stack = new Stack<>();

        /*
        Push elements from half of linked list onto stack. When fast runner
        * (which is moving at 2x speed) reaches the end of the linked list, then we
        * know we're at the middle
         */

        while (slow != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        while (slow != null) {
            int top = stack.pop();
            /* If values are different, then it's not a palindrome */
            if (top != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    // Recursive style

    static boolean isPalindrome3(Node head) {
        int len = lengthOfList(head);
        Result res = isPalindromeRecurse(head, len);
        return res.result;
    }

    static Result isPalindromeRecurse(Node head, int length) {
        if (head == null || length <= 0) {
            return new Result(head, true);
        } else if (length == 1) { // odd
            return new Result(head.next, true);
        }

        Result res = isPalindromeRecurse(head.next, length - 2);

        if (!res.result || res.node == null) {
            return res;
        }

        // Check if matches corresponding node on other side.
        res.result = (head.data == res.node.data);

        // Return corresponding node.
        res.node = res.node.next;

        return res;
    }

    static int lengthOfList(Node n) {
        int counter = 0;
        while (n != null) {
            counter++;
            n = n.next;
        }
        return counter;
    }

    static class Result {
        public Node node;
        public boolean result;

        public Result(Node node, boolean result) {
            this.node = node;
            this.result = result;
        }
    }

}
