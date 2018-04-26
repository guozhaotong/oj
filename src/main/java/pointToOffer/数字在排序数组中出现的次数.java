package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/12.
 */
public class 数字在排序数组中出现的次数 {
    public static void main(String[] args) {
        int[] array = {3, 3, 3, 3, 4, 5};
        System.out.println(GetNumberOfK(array, 3));
    }

    public static int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int start = 0, end = array.length - 1;
        int mid = (start + end) >> 1;
        while (array[mid] != k) {
            if (end <= start) {
                return 0;
            }
            if (array[mid] < k) {
                start = mid + 1;
                mid = (start + end) >> 1;
            } else {
                end = mid - 1;
                mid = (start + end) >> 1;
            }
        }
        int i = mid - 1, num = 1;
        while (i >= 0 && array[i] == k) {
            num++;
            i--;
        }
        i = mid + 1;
        while (i <= array.length - 1 && array[i] == k) {
            num++;
            i++;
        }
        return num;
    }
}
