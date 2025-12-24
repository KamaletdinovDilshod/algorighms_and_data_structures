package leetcode.medium;

import java.util.*;

public class KeysAndRooms {
    public static void main(String[] args) {
        List<List<Integer>> rooms = List.of(
                List.of(1, 3),      // room 0 has key to room 1
                List.of(3, 0, 1),      // room 1 has key to room 2
                List.of(2),      // room 2 has key to room 3
                List.of(0)        // room 3 has no keys
        );

        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        HashSet<Integer> visited = new HashSet<>();

        Queue<Integer> q = new LinkedList<>();

        visited.add(0);
        q.add(0);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int it : rooms.get(node)) {
                if (!visited.contains(it)) {
                    visited.add(it);
                    q.add(it);
                }
            }
        }
        return visited.size() == rooms.size();
    }
}
