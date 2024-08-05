package leetcode.medium;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        int row = 0, dir = 0;
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            row += dir;
            sb[row].append(c);
            if (row == 0 || row == numRows - 1)
                dir = (dir == 0) ? 1 : -dir;
        }
        return converts(sb);
    }

    private static String converts(StringBuilder[] sb) {
        StringBuilder res = new StringBuilder();
        for (StringBuilder ss : sb) {
            res.append(ss.toString());
        }
        return res.toString();
    }
}
