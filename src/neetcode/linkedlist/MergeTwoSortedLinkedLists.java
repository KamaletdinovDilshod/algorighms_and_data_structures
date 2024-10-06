package neetcode.linkedlist;

import cracking.linkedlist.Node;

public class MergeTwoSortedLinkedLists {

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public Node mergeTwoLists(Node list1, Node list2) {
        Node result = new Node(0);
        Node node = result;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }
        return result.next;
    }
}
