package leetcode.easy;

import java.util.Arrays;
import java.util.Objects;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        String ss = " 3c      2zPeO dpIMVv2SG    1AM       o       VnUhxK a5YKNyuG     x9    EQ  ruJO       0Dtb8qG91w 1rT3zH F0m n G wU";
        System.out.println(Arrays.toString(ss.trim().split(" ")));
    }

    // Solution 1
    public static String reverseWords1(String s) {
        String[] words = s.trim().split("\\s+");
        int i = 0;
        int j = words.length - 1;


        while (i < j) {
            String temp = words[i].trim();
            words[i] = words[j].trim();
            words[j] = temp.trim();
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for (String k : words) {
            sb.append(k).append(" ");
        }
        return sb.toString().trim();
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        int i = 0;
        int j = words.length - 1;

        while (i < j) {
            if ((!Objects.equals(words[i], " ") && !Objects.equals(words[j], " ") && !Objects.equals(words[j], "") && !Objects.equals(words[i], ""))) {
                String temp = words[i].trim();
                words[i] = words[j].trim();
                words[j] = temp.trim();
                i++;
                j--;
            } else if (Objects.equals(words[i], "") || Objects.equals(words[i], " ")) {
                words[i] = null;
                i++;
            } else if (Objects.equals(words[j], "") || Objects.equals(words[j], " ")) {
                words[j] = null;
                j--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < words.length; k++) {
            System.out.println("THIS KKK: " + words[k]);
            if (!Objects.equals(words[k], " ") || !Objects.equals(words[k], "") || words[k] != null) {
                if (k != 0) {
                    sb.append("-");
                }
                sb.append(words[k]);
            }
        }
        return sb.toString();
    }
}
