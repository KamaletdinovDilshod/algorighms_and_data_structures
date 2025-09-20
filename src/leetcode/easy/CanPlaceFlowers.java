package leetcode.easy;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 0, 0, 1, 0, 0};
        System.out.println(canPlaceFlowers(array, 1));
        System.out.println(canPlaceFlowers(array, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean isLeftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean isRightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (isLeftEmpty && isRightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                    if (n <= 0) return true;
                }

            }
        }
        return n <= 0;
    }
}
