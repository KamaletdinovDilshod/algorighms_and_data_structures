package cracking.linkedlist;

public class ReturnKthToLast {
    public static void main(String[] args) {
        Node linkedList = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        System.out.println(returnKthToLastElement(linkedList, 2));
        System.out.println(nthToLast(linkedList, 2).data);
        System.out.println(kthToLast(linkedList, 2).data);
    }


    // Solution 1
    public static int returnKthToLastElement(Node head, int k) {
        if (head == null) {
            return 0;
        }

        int index = returnKthToLastElement(head.next, k) + 1;

        if (index == k) System.out.println(k + "th to last node is " + head.data);

        return index;
    }


    // Solution 2

    static class Index {
        public int value = 0;
    }

    static Node kthToLast(Node head, int k) {
        Index idx = new Index();
        return kthToLast(head, k, idx);
    }

    static Node kthToLast(Node head, int k, Index idx) {
        if (head == null) return null;
        Node node = kthToLast(head.next, k, idx);
        idx.value = idx.value + 1;
        if (idx.value == k) return head;
        return node;
    }

    // Solution 3
    static Node nthToLast(Node head, int k) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k; i++) {
            if (p1 == null) return null; // Out of bounds
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

}
