package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/4.
 */
public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {

    }

    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int times = 1;
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (times == 0) {
                index = i;
                times = 1;
                continue;
            }
            if (array[i] == array[index]) {
                times++;
            } else {
                times--;
            }
        }
        if (times < 1) {
            return 0;
        }
        times = 0;
        for (int i : array) {
            if (i == array[index]) {
                times++;
            }
        }
        if (times > array.length / 2) {
            return array[index];
        } else {
            return 0;
        }
    }
}
