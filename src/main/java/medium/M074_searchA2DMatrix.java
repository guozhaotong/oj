package medium;

/**
 * @author 郭朝彤
 * @date 2018/1/29.
 */
public class M074_searchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println(searchMatrix(matrix, 50));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowNum = matrix.length;
        if (rowNum == 0) {
            return false;
        }
        int colNum = matrix[0].length;
        if (colNum == 0) {
            return false;
        }
        if (target < matrix[0][0]) {
            return false;
        }
        if (target > matrix[rowNum - 1][colNum - 1]) {
            return false;
        }
        int left = 0, right = rowNum - 1;
        int p;
        while (left < right - 1) {
            p = (left + right) / 2;
            if (matrix[p][0] == target) {
                return true;
            }
            if (matrix[p][0] > target) {
                right = p;
            } else {
                left = p;
            }
        }
        return (searchVector(matrix[left], target) || searchVector(matrix[right], target));
    }

    public static boolean searchVector(int[] vec, int tar) {
        int left = 0, right = vec.length - 1;
        int p;
        while (left < right - 1) {
            p = (left + right) / 2;
            if (vec[p] == tar) {
                return true;
            }
            if (vec[p] > tar) {
                right = p;
            } else {
                left = p;
            }
        }
        if (vec[left] != tar && vec[right] != tar) {
            return false;
        } else {
            return true;
        }

    }
}
