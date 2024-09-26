package cracking.linkedlist;

public class Partition {
    public static void main(String[] args) {
        Node ll = new Node(3, new Node(5, new Node(8, new Node(5, new Node(10, new Node(2, new Node(1, null)))))));
        partition(ll, 5);
    }

    public static Node partition(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {

            Node next = node.next;
            if (node.data < x) {
                head.next = node;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }
}
