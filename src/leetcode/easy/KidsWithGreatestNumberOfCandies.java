package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>(candies.length);

        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        System.out.println(maxCandies);
        for (int candy : candies) {
            System.out.println(candy + extraCandies);
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
