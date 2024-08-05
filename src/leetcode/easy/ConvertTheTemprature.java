package leetcode.easy;

import java.util.Arrays;

public class ConvertTheTemprature {
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double faranheit = celsius * 1.80 + 32.0;
        return (new double[]{kelvin, faranheit});
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(122.11)));
    }
}
