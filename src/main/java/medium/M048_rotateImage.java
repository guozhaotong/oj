package medium;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2017/12/5.
 */
public class M048_rotateImage {
    public static void rotate(int[][] matrix) {
        if(matrix.length > 1) {
            for (int i = 0; i < matrix.length-1; i++) {
                for(int j = i+1; j < matrix.length; j++){
                    swapDiagonal(matrix, i, j);
                }
            }
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix.length/2; j++){
                    swapDiad(matrix, i, j);
                }
            }
        }
    }

    public static void swapDiad(int[][] matrix, int x, int y){
        int temp = matrix[x][y];
        matrix[x][y] = matrix[x][matrix.length-y-1];
        matrix[x][matrix.length-y-1] = temp;
    }

    public static void swapDiagonal(int[][] matrix, int x, int y){
        int temp = matrix[x][y];
        matrix[x][y] = matrix[y][x];
        matrix[y][x] = temp;
    }
    public static void main(String[] args){
        int[][] matrix = {{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};
        rotate(matrix);
        for(int[] x : matrix){
            System.out.println(Arrays.toString(x));
        }
    }
}
