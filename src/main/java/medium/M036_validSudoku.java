package medium;

import java.util.HashSet;

/**
 * @author 郭朝彤
 * @date 2017/12/7.
 */
public class M036_validSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int i = 0, j = 0;
        while(i < board.length){
            HashSet<Character> setRow = new HashSet<>();
            HashSet<Character> setCol = new HashSet<>();
            j = 0;
            while(j < board.length){
                if(board[i][j] == '.' || (!(board[i][j] == '.') && !setRow.contains(board[i][j]))){
                    setRow.add(board[i][j]);
                } else {
                    System.out.println(1);
                    return false;
                }
                if(board[j][i] == '.' || (!(board[j][i] == '.') && !setCol.contains(board[j][i]))){
                    setCol.add(board[j][i]);
                } else {
                    System.out.println(2);
                    return false;
                }
                j++;
            }
            i++;
        }
        i = 0;j = 0;
        while(i < 7){
            while(j < 7){
                HashSet<Character> set = new HashSet<>();
                for(int k = 0; k < 3; k++){
                    for(int t = 0; t < 3; t++){
                        if(board[k+i][t+j] == '.' || (!(board[k+i][t+j] == '.') && !set.contains(board[k+i][t+j]))){
                            set.add(board[k+i][t+j]);
                        } else {
                            System.out.println(3);
                            return false;
                        }
                    }
                }
                j = j + 3;
            }
            i = i + 3;
        }
        return true;
    }

    public static void main(String[] args){
        String[][] s = {{".",".","4",".",".",".","6","3","."},{".",".",".",".",".",".",".",".","."},{"5",".",".",".",".",".",".","9","."},{".",".",".","5","6",".",".",".","."},{"4",".","3",".",".",".",".",".","1"},{".",".",".","7",".",".",".",".","."},{".",".",".","5",".",".",".",".","."},{".",".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".",".","."}};
//        char[][] board = {{'.','8','7','6','5','4','3','2','1'},{'2','8','.','.','.','.','.','.','.'},{'3','.','.','.','.','.','.','.','.'},{'4','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','.','.'},{'6','.','.','.','.','.','.','.','.'},{'7','.','.','.','.','.','.','.','.'},{'8','.','.','.','.','.','.','.','.'},{'9','.','.','.','.','.','.','.','.'}};
char[][] board = new char[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                board[i][j] = s[i][j].toCharArray()[0];
            }
        }
        boolean b = isValidSudoku(board);
        System.out.println(b);
    }
}
