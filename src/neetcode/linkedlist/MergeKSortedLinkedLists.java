package neetcode.linkedlist;

import cracking_the_coding_interview.linkedlist.Node;

import java.util.PriorityQueue;

public class MergeKSortedLinkedLists {
    public Node mergeKLists(Node[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Node list : lists) {
            while (list != null) {
                pq.add(list.data);
                list = list.next;
            }
        }

        Node ans = new Node(0);
        Node dummy = ans;
        while (!pq.isEmpty()) {
            dummy.next = new Node(pq.poll());
            dummy = dummy.next;
        }
        return ans;
    }
}
