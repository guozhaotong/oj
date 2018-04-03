package newCoder;

/**
 * @author 郭朝彤
 * @date 2018/3/15.
 */
public class TimeOf4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(isRight(arr));
    }

    public static boolean isRight(int[] arr) {
        int len = arr.length;
        int count2 = 0, count4 = 0;
        for (int a : arr) {
            if (a % 2 == 0) {
                count2++;
                if (a % 4 == 0) {
                    count4++;
                }
            }
        }
        if (count4 >= len / 2 || count2 == len) {
            return true;
        }
        count2 = count2 - count4;
        if (count2 % 2 == 0 && count4 >= (len - count2) / 2) {
            return true;
        }
        if (count2 % 2 == 1 && count4 >= (len - count2 + 1) / 2) {
            return true;
        }
        return false;
    }
}
