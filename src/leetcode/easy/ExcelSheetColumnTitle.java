package leetcode.easy;

import java.util.HashMap;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }

    public static String convertToTitle(int columnNumber) {
        HashMap hm = new HashMap<>();
        StringBuilder st = new StringBuilder();
        int i = 1;
        char ch = 'A';
        while (i < 27 && ch <= 'Z') {
            hm.put(i, ch);
            i++;
            ch++;
        }

        int residual;
        while (columnNumber != 0) {
            residual = columnNumber % 26;
            if (residual == 0) {
                st.insert(0, hm.get(26));
                columnNumber = columnNumber / 26 - 1;
            } else {
                st.insert(0, hm.get(residual));
                columnNumber /= 26;
            }
        }
        return st.toString();
    }
}
