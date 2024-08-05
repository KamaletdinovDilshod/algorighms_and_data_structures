package leetcode.easy;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] image2 = {{1, 1, 0},{1,0,1},{0, 0 , 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
        System.out.println(Arrays.deepToString(flipAndInvertImage(image2)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int C = image[0].length;
        for (int[] row : image) {
            for (int i = 0; i < (C + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }
        }
        return image;
//        int temp;
//        for (int i = 0; i < image.length; i++) {
//            int k = image[i].length - 1;
//            int j = 0;
//            while (j <= k) {
//                temp = image[i][k];
//                if (temp == 0) {
//                    temp = 1;
//                } else {
//                    temp = 0;
//                }
//                image[i][k] = image[i][j];
//                if (image[i][k] == 0){
//                    image[i][k] =1;
//                } else {
//                    image[i][k] = 0;
//                }
//                image[i][j] = temp;
//                k--;
//                j++;
//
//            }
//        }
//        return image;
    }
}
