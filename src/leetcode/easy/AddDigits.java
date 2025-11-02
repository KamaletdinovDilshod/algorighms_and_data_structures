package leetcode.easy;

public class AddDigits {
    public static void main(String[] args) {
//        System.out.println("THIS IS NUMMY: " + (338 / 10));
        System.out.println(addDigits(38));
        System.out.println(addDigits2(38));
    }

    public static int addDigits(int num) {

        int countedNum = 0;

        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            countedNum += r;

            if (countedNum / 10 != 0 && num == 0) {
                num = countedNum;
                countedNum = 0;
            }
        }
        return countedNum;
    }

    public static int addDigits2(int num) {

        if (num == 0) return 0;
        else if (num % 9 == 0) return 9;
        else return num % 9;
    }
}
