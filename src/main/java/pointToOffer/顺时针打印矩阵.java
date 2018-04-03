package pointToOffer;

import java.util.ArrayList;

/**
 * @author 郭朝彤
 * @date 2018/4/2.
 */
public class 顺时针打印矩阵 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int rowS = 0;
        int rowE = matrix.length - 1;
        int colS = 0;
        int colE = matrix[0].length - 1;
        int i = 0;
        while (rowS <= rowE && colS <= colE) {
            for (i = colS; i <= colE; i++) {
                res.add(matrix[rowS][i]);
            }
            rowS++;
            if (rowS > rowE) {
                break;
            }
            for (i = rowS; i <= rowE; i++) {
                res.add(matrix[i][colE]);
            }
            colE--;
            if (colS > colE) {
                break;
            }
            for (i = colE; i >= colS; i--) {
                res.add(matrix[rowE][i]);
            }
            rowE--;
            if (rowS > rowE) {
                break;
            }
            for (i = rowE; i >= rowS; i--) {
                res.add(matrix[i][colS]);
            }
            colS++;
        }
        return res;
    }
}

