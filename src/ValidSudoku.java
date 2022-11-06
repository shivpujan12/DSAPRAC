import java.util.Arrays;
import java.util.HashMap;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!checkRow(i, board)) {
                return false;
            } else if (!checkCol(i, board)) {
                return false;
            }
        }
        return checkGrid(board);
    }

    private boolean checkGrid(char[][] board) {
        int[] gridStart = {0, 3, 6};
        int[] map = new int[10];

        for (int firstRow : gridStart) {
            for (int firstCol : gridStart) {
                for (int row = firstRow; row <= firstRow + 2; row++) {
                    for (int col = firstCol; col <= firstCol + 2; col++) {
                        char c = board[row][col];
                        if (c != '.') {
                            int val = Integer.parseInt(String.valueOf(c));
                            if (map[val] != 0) {
                                return false;
                            } else {
                                map[val] = val;
                            }
                        }
                    }
                }
                int[] newArr = new int[10];
                map = newArr.clone();
            }
        }

        return true;
    }

    private boolean checkCol(int colNo, char[][] board) {
        int[] map = new int[10];
        for (int i = 0; i < 9; i++) {
            char c = board[i][colNo];
            if (c != '.') {
                int val = Integer.parseInt(String.valueOf(c));
                if (map[val] != 0) {
                    return false;
                } else {
                    map[val] = val;
                }
            }
        }
        return true;
    }

    public boolean checkRow(int rowNo, char[][] board) {
        int[] map = new int[10];
        for (int i = 0; i < 9; i++) {
            char c = board[rowNo][i];
            if (c != '.') {
                int val = Integer.parseInt(String.valueOf(c));
                if (map[val] != 0) {
                    return false;
                } else {
                    map[val] = val;
                }
            }
        }
        return true;
    }

    public void unitTest() {
        char[][] board = {
                 {'.', '.', '.', '.', '5', '.', '.', '1', '.'}
                ,{'.', '4', '.', '3', '.', '.', '.', '.', '.'}
                ,{'.', '.', '.', '.', '.', '3', '.', '.', '1'}
                ,{'8', '.', '.', '.', '.', '.', '.', '2', '.'}
                ,{'.', '.', '2', '.', '7', '.', '.', '.', '.'}
                ,{'.', '1', '5', '.', '.', '.', '.', '.', '.'}
                ,{'.', '.', '.', '.', '.', '2', '.', '.', '.'}
                ,{'.', '2', '.', '9', '.', '.', '.', '.', '.'}
                ,{'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(isValidSudoku(board));

    }

}
