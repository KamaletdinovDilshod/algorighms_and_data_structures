package leetcode.medium;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'.','.','.','.','5','.','.','1','.'}
                         ,{'.','4','.','3','.','.','.','.','.'}
                         ,{'.','.','.','.','.','3','.','.','1'}
                         ,{'8','.','.','.','.','.','.','2','.'}
                         ,{'.','.','2','.','7','.','.','.','.'}
                         ,{'.','1','5','.','.','.','.','.','.'}
                         ,{'.','.','.','.','.','2','.','.','.'}
                         ,{'.','2','.','9','.','.','.','.','.'}
                         ,{'.','.','4','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> column = new HashSet<>();
        HashSet<Character> boxTop = new HashSet<>();
        HashSet<Character> boxMiddle = new HashSet<>();
        HashSet<Character> boxBottom = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println("column" + column + "row" + row);
                char ro = board[i][j];
                char co = board[j][i];
                if (Character.isDigit(ro)) {
                    if (!row.contains(ro)) {
                        row.add(ro);
                    } else return false;
                }
                if (Character.isDigit(co)) {
                    if (!column.contains(co)) {
                        column.add(co);
                    } else return false;
                }
            }
            column.clear();
            row.clear();
        }
                int o = 0;
                int g = 3;
                for (int z = 0; z < 3; ++z) {
                    boxTop.clear();
                    for (int a = 0; a < 3; a++){
                        for (int b = o; b < g; ++b) {
                            if (Character.isDigit(board[a][b])) {
                                if (!boxTop.contains(board[a][b])) boxTop.add(board[a][b]);
                                else return false;
                            }
                        }
                    }
                    o += 3;
                    g += 3;
                }
                o = 0;
                g = 3;
                for (int z = 0; z < 3; ++z) {
                    boxMiddle.clear();
                    for (int i = 3; i < 6; i++) {
                        for (int j = o; j < g; j++){
                            if (Character.isDigit(board[i][j])) {
                                if (!boxMiddle.contains(board[i][j])) boxMiddle.add(board[i][j]);
                                else return false;
                            }
                        }
                    }
                    o += 3;
                    g += 3;
                }
                o = 0;
                g = 3;
                for (int z = 0; z < 3; z++) {
                    boxBottom.clear();
                    for (int i = 6; i < 9; i++) {
                        for (int j = o; j < g; j++) {
                            if (Character.isDigit(board[i][j])) {
                                if (!boxBottom.contains(board[i][j]))  boxBottom.add(board[i][j]);
                                else return false;
                            }
                        }
                    }
                    o += 3;
                    g += 3;
                }
        return true;
    }
}
