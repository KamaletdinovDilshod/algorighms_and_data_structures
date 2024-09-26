package cracking.linkedlist;

public class LoopDetection {
    public static void main(String[] args) {

    }

    public static Node findBeginning(Node head) {
        Node slow = head;
        Node fast = head;

        /* Find meeting point. This will be LOOP_SIZE - k steps into the linked list. */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        /* Error check - no meeting point, and therefore no loop*/
        if (fast == null || fast.next == null) {
            return null;
        }

        /* Move slow to Head. Keep fast at Meeting Point. Each are k steps from the
         * Loop Start. If they move at the same pace, they must meet at Loop Start. */
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
