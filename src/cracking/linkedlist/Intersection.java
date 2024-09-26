package cracking.linkedlist;

public class Intersection {

    public static Node intersection(Node l1, Node l2) {
        Result result1 = getTailAndSize(l1);
        Result result2 = getTailAndSize(l2);

        if (result1.tail != result2.tail) {
            return null;
        }

        Node shorter = result1.size < result2.size ? l1 : l2;
        Node longer = result1.size < result2.size ? l2 : l1;

        longer = getKthNode(longer, Math.abs(result1.size - result2.size));

        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }

        return longer;

    }

    static Node getKthNode(Node head, int k) {
        Node current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    static class Result {
        public Node tail;
        public int size;

        public Result(Node tail, int size) {
            this.tail = tail;
            this.size = size;
        }
    }

    static Result getTailAndSize(Node list) {
        if (list == null) return null;
        int size = 1;
        Node current = list;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        return new Result(current, size);
    }
}