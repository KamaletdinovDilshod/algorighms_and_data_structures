package leetcode.easy;


public class StringCompression {
    public static void main(String[] args) {
        char[] arr = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        System.out.println(compress(arr));
    }

    public static int compress(char[] chars) {

        int counter = 0;
        int index = 0;
        char prev = chars[0];
        for (char c : chars) {
            if (c == prev) {
                counter++;
            } else {
                chars[index++] = prev;
                prev = c;
                if (counter != 1) {
                    for (char n : String.valueOf(counter).toCharArray()) {
                        chars[index++] = n;
                    }
                    counter = 1;
                }
            }
        }

        chars[index++] = prev;

        if (counter != 1) {
            for (char n : String.valueOf(counter).toCharArray()) {
                chars[index++] = n;
            }
        }

        return index;
    }

}
