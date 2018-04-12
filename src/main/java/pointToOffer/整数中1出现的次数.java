package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/11.
 */
public class 整数中1出现的次数 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(5));
    }

    public static int NumberOf1Between1AndN_Solution(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = num + num1(i);
        }
        return num;
    }

    public static int num1(int k) {
        int num = 0;
        while (k > 0) {
            if (k % 10 == 1) {
                num++;
            }
            k = k / 10;
        }
        return num;
    }
}
