package leetcode.medium;

public class FindTheIndexOfTheFirstOccuranceInAString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "eet";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle))
            return -1;

        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                int x = i + 1;
                for (j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(x) != needle.charAt(j))
                        break;
                    x++;
                }

                if (j == needle.length()) {
                    return i;
                }
                j = 0;
            }
        }
        return -1;
//
//        StringBuilder sb = new StringBuilder();
//        int counter = -1;
//        int n = haystack.length() - needle.length();
//        if (needle.length() > haystack.length()) {
//            return -1;
//        }
//        if (n == 0) {
//            if (haystack.equals(needle)) {
//                return 0;
//            } else {
//                return -1;
//            }
//        }
//        for (int i = 0; i < haystack.length(); i++) {
//            counter++;
//            for (int j = i; j < i + needle.length(); j++) {
//                if (j >= haystack.length()) {
//                    break;
//                }
//                sb.append(haystack.charAt(j));
//            }
//            if (!sb.toString().equals(needle)) {
//                if (i == haystack.length() - 1) {
//                    return -1;
//                }
//                sb.setLength(0);
//            } else return counter;
//        }
//        return counter;
    }
}
