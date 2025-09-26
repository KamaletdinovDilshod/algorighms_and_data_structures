package leetcode.medium;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxVolume = 0;

        int i = 0, j = height.length - 1;

        while (i < j) {
            maxVolume = Math.max(maxVolume, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxVolume;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(height));


    }
}
