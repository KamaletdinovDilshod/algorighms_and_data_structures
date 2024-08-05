package leetcode.medium;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxVolume = 0;
        while (i < j) {
            int volume = Math.min(height[i], height[j]) * (j - i);
            maxVolume = Math.max(maxVolume, volume);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxVolume;
    }

//        int i = 0;
//        int ii = 0;
//        int jj = 0;
//        int j = height.length - 1;
//        int length;
//        int sq;
//        int mainsq = 0;
//        int previ = height[0];
//        int prevj = 0;
//        while (i <= j) {
//            if (previ < height[i]) {
//                previ = height[i];
//                ii = i;
//            }else if (prevj < height[j]) {
//                jj = j;
//                prevj = height[j];
//                j--;
//            }
//            length = Math.abs(ii - jj);
//            sq = Math.min(previ, prevj) * length;
//            if (sq > mainsq) {
//                mainsq = sq;
//            }
//            System.out.println("i" + i + "j" +  j);
//            i++;
//
//        }
//        return mainsq;
//    }
//
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }
}
