package pointToOffer;

import java.util.ArrayList;

/**
 * @author 郭朝彤
 * @date 2018/4/12.
 */
public class 和为S的两个数字 {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 7, 11, 15};
        FindNumbersWithSum(num, 15);
    }

    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            if (array[low] + array[high] == sum) {
                res.add(array[low]);
                res.add(array[high]);
                System.out.println(res);
                return res;
            }
            if (array[low] + array[high] < sum) {
                low++;
            } else {
                high--;
            }
        }
        return res;
    }
}
