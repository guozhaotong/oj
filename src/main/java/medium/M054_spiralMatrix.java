package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/12/19.
 */
public class M054_spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>(matrix.length * matrix[0].length);
        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (up <= down && left <= right) {
            int row, col;
            for (col = left; col <= right; col++) {
                list.add(matrix[up][col]);
            }
            up++;
            for (row = up; row <= down; row++) {
                list.add(matrix[row][right]);
            }
            right--;
            for (col = right; col >= left && up <= down; col--) {
                list.add(matrix[down][col]);
            }
            down--;
            for (row = down; row >= up && left <= right; row--) {
                list.add(matrix[row][left]);
            }
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1},{2},{3}};
        System.out.println(spiralOrder(matrix));
    }
}
