package medium;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author 郭朝彤
 * @date 2018/1/19.
 */
public class M073_setMatrixZeroes {
    public static void main(String[] args) {
//        trans("[[-4,-2147483648,6,-7,0],[-8,6,-8,-6,0],[2147483647,2,-9,-6,-10]]");
        int[][] matrix = {{-4,-2147483648,6,-7,0},{-8,6,-8,-6,0},{2147483647,2,-9,-6,-10}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void trans(String s){
        s = s.replaceAll("\\[","{");
        System.out.println(s.replaceAll("]","}"));
    }

    public static void setZeroes(int[][] matrix) {
        if(matrix.length == 0){
            return;
        }
        HashSet<Integer> setRow = new HashSet<>();
        int i = 0;
        for(int[] row : matrix){
            for(int col : row){
                if (col == 0){
                    setRow.add(i);
                    break;
                }
            }
            i++;
        }
        if(setRow.size() == matrix.length){
            for(int[] row : matrix){
                Arrays.fill(row,0);
            }
            return;
        }
        HashSet<Integer> setCol = new HashSet<>();
        for(i = 0; i < matrix[0].length; i++){
            for(int j = 0 ;j < matrix.length; j++){
                if(matrix[j][i] == 0){
                    setCol.add(i);
                    break;
                }
            }
        }
        if(setCol.size() == matrix[0].length){
            for(int[] row : matrix){
                Arrays.fill(row,0);
            }
            return;
        }
        for(int a : setRow){
            Arrays.fill(matrix[a],0);
        }
        for(int a : setCol){
            for(i = 0; i < matrix.length; i++){
                matrix[i][a] = 0;
            }
        }
    }
}
