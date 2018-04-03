package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/3/27.
 */
public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        int[] array = {6501, 6828, 6963, 7036, 7422, 7674, 8146, 8468, 8704, 8717, 9170, 9359, 9719, 9895, 9896, 9913, 9962, 154, 293, 334, 492, 1323, 1479, 1539, 1727, 1870, 1943, 2383, 2392, 2996, 3282, 3812, 3903, 4465, 4605, 4665, 4772, 4828, 5142, 5437, 5448, 5668, 5706, 5725, 6300, 6335};
        System.out.println(minNumberInRotateArrayByPointToOffer(array));
    }

    public int minNumberInRotateArrayByMe(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int minNumberInRotateArrayByPointToOffer(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int l = 0;
        int r = array.length - 1;
        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            if (mid == l || mid == r) {
                break;
            }
            if (array[mid] >= array[l]) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return array[r];
    }
}
