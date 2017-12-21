package medium;

import com.sun.rowset.internal.Row;

import java.util.Arrays;

public class M059_spiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int up = 0, down = n-1, left = 0;
        int row, col;
        int i = 1;
        while(up <= down && left <= n-1) {
            for(col = left ; col <= n-1; col++){
                matrix[up][col] = i++;
            }
            for (row = ++up; row <= down; row ++){
                matrix[row][n-1] = i++;
            }
            for(col = --n-1; col >= left ; col --){
                matrix[down][col] = i++;
            }
            for(row = --down; row >= up; row--){
                matrix[row][left] = i++;
            }
            left++;
        }
        return matrix;
    }

    public static void main(String[] args){
        System.out.println(Arrays.deepToString(generateMatrix(0)));
    }
}
