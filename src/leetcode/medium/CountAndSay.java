package leetcode.medium;


public class CountAndSay {
    public static void main(String[] args) {
        countAndSay(4);
        countAndSay2(4);
    }

    public static String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        n--;


        while (n-- > 0) {
            System.out.println("NNN " + n);

            char prev = sb.charAt(0);
            int count = 0;
            StringBuilder nSb = new StringBuilder();

            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) != prev) {
                    nSb.append(prev).append(count);
                    prev = sb.charAt(i);
                    count = 1;
                } else {
                    count++;
                }

                if (i == sb.length() - 1) {
                    nSb.append(prev).append(count);
                    count = 1;
                }
            }
            System.out.println("THIS IS SBS " + nSb);
            sb = nSb;
        }

        return sb.reverse().toString();
    }

    // Solution 2
    public static String countAndSay2(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
            res = buildNext(res);
        }
        return res;
    }

    private static String buildNext(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(s.charAt(s.length() - 1));
        return result.toString();
    }
}
