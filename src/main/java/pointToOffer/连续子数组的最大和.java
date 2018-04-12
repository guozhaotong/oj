package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/11.
 */
public class 连续子数组的最大和 {
    public static void main(String[] args) {

    }

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        int max = array[0];
        for (int k = 0; k < array.length; k++) {
            sum = sum + array[k];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
