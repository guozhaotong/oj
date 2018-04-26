package pointToOffer;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2018/4/12.
 */
public class 数组中只出现一次的数字 {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 6, 3, 2, 5, 5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce(array, num1, num2);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }

    public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Arrays.sort(array);
        num2[0] = array[array.length - 1];
        int i = 1;
        for (; i < array.length; i += 2) {
            if (array[i] != array[i - 1]) {
                num1[0] = array[i - 1];
                break;
            }
        }
        for (i++; i < array.length; i += 2) {
            if (array[i] != array[i - 1]) {
                num2[0] = array[i - 1];
                break;
            }
        }
    }
}
