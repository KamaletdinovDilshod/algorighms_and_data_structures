package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDDRRDDRDRDRDRDRDRDRDRDDDDRRRDRDRDRDRDRDRDRDRD"));
    }

    public static String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'D') {
                direQueue.add(i);
            } else {
                radiantQueue.add(i);
            }
        }

        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            if (radiantQueue.peek() < direQueue.peek()) {
                radiantQueue.add(n++);
            } else {
                direQueue.add(n++);
            }
            direQueue.poll();
            radiantQueue.poll();
        }
        return (radiantQueue.isEmpty()) ? ("Dire") : ("Radiant");
    }
}
