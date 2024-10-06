package neetcode.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Integer>> columns = new HashMap<>();
        HashMap<Integer, Set<Integer>> rows = new HashMap<>();
        HashMap<Integer, Set<Integer>> subBoxes = new HashMap<>();

        for (int r = 0; r < board.length; r++) {
            rows.put(r, new HashSet<>());
            for (int c = 0; c < board[0].length; c++) {
                if (Character.isDigit(board[r][c])) {
                    int cell = board[r][c] - '0';

                    if (
                            rows.getOrDefault(r, new HashSet<>()).contains(cell) ||
                                    columns.getOrDefault(c, new HashSet<>()).contains(cell) ||
                                    subBoxes.getOrDefault((r / 3) * 3 + c / 3, new HashSet<>()).contains(cell)
                    ) {
                        return false;
                    }
                    columns.computeIfAbsent(c, k -> new HashSet<>()).add(cell);
                    rows.computeIfAbsent(r, k -> new HashSet<>()).add(cell);
                    subBoxes.computeIfAbsent((r / 3) * 3 + c / 3, k -> new HashSet<>()).add(cell);
                }
            }
        }
        return true;
    }
}
