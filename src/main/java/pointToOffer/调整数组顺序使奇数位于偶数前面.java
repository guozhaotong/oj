package pointToOffer;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2018/3/30.
 */
public class 调整数组顺序使奇数位于偶数前面 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reOrderArray(int[] array) {
        int singleNum = 0;
        int doubleNum = 0;
        for (int i : array) {
            if ((i & 1) == 1) {
                singleNum++;
            } else {
                doubleNum++;
            }
        }
        int[] newArray = new int[array.length];
        int ss = 0, ds = singleNum;
        for (int i : array) {
            if ((i & 1) == 1) {
                newArray[ss++] = i;
            } else {
                newArray[ds++] = i;
            }
        }
        System.arraycopy(newArray, 0, array, 0, array.length);
    }
}
