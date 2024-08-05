package leetcode.easy;

import java.util.HashSet;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1000,1,1,1};
        System.out.println(distributeCandies(candyType));
    }
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for (int j : candyType) {
            hs.add(j);
        }
        return Math.min(hs.size(), candyType.length / 2);
    }
}
