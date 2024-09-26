package cracking.linkedlist;

import java.util.HashSet;

public class RemoveDuplicateNodes {

    public static void removeDuplicated(Node n) {
        HashSet<Integer> hs = new HashSet<>();
        Node previus = null;
        while (n != null) {
            if (hs.contains(n.data)) {
                previus.next = n.next;
            } else {
                hs.add(n.data);
                previus = n;
            }
            n = n.next;
        }
    }

    public static void removeDuplicated2(Node n) {
        Node current = n;
        while (current != null) {
            Node runner = n;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    static class Node {
        Node next = null;
        int data;

        public Node(int d) {
            data = d;
        }
    }
}
