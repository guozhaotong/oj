package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/3/30.
 */
public class 二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(-2));
    }

    public static int NumberOf1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == Integer.MIN_VALUE) {
            return 1;
        }
        int count = 0;
        int constent1 = 0;
        boolean b = true;
        int r = n;
        n = Math.max(n, -1 * n);
        while (n > 0) {
            if (n % 2 == 1) {
                b = false;
                count++;
            } else if (b) {
                constent1++;
            }
            n = n / 2;
        }
        if (r > 0) {
            return count;
        } else {
            return 32 - count - constent1 + 1;
        }
    }
}
