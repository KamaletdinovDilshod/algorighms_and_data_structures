package cracking_the_coding_interview.linkedlist;

public class SumLists {

    Node sumLists(Node list1, Node list2, int carry) {
        if (list1 == null && list2 == null) {
            return null;
        }

        Node result = new Node();
        int value = carry;
        if (list1 != null) {
            value += list1.data;
        }
        if (list2 != null) {
            value += list2.data;
        }

        result.data = value % 10;

        Node more = sumLists(
                list1 == null ? null : list1.next,
                list2 == null ? null : list2.next,
                value >= 10 ? 1 : 0
        );
        result.setNext(more);
        return result;
    }
}
