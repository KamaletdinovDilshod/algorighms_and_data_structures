package leetcode.easy;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String[] st = {"step", "steps", "stripe", "stepple"};
        String licensePlate = "1s3 PSt";
        System.out.println(shortestCompletingWord(licensePlate, st));

    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {

        String result = "";
        int[] license = helper(licensePlate);
        for (String word : words) {
            boolean valid = true;
            int[] cur = helper(word);
            for (int i = 0; i <= 25; i++) {
                if (license[i] == 0) continue;
                if (license[i] > cur[i]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                if (result.isBlank()) {
                    result = word;
                } else if (result.length() > word.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    public static int[] helper(String target) {
        int[] letters = new int[26];

        for (int i = 0; i < target.length(); i++) {
            int ch = Character.toLowerCase(target.charAt(i)) - 'a';
            if (ch >= 0 && ch <= 25) letters[ch]++;
        }
        return letters;
    }
}
