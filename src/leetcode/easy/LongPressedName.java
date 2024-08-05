package leetcode.easy;


public class LongPressedName {
    public static void main(String[] args) {
        String name = "alex", typed = "aaleex";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        if (name.length() > typed.length() || name.charAt(0) != typed.charAt(0)) {
            return false;
        }
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else {
                i--;
                if (name.charAt(i) != typed.charAt(j)) {
                    return false;
                }
            }
        }
        while (j < typed.length()) {
            if (name.charAt(name.length() - 1) != typed.charAt(j)) {
                return false;
            }
            j++;
        }
        return i == name.length();
    }
}
