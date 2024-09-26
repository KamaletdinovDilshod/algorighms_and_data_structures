package cracking.linkedlist;

class Node {
    int data;
    Node next;

    // Constructor for just the data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Constructor for data and next node
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
