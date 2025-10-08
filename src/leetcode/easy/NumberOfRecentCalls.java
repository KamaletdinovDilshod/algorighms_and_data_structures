package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    public static void main(String[] args) {

    }
}


class RecentCounter {

    Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.add(t);
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }
}
