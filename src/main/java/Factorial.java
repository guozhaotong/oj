import java.util.Arrays;

/**
 * User: tong
 * Date: 17-12-21
 * Time: 下午10:35
 * \
 */
public class Factorial {
    public static long[] factorial(int n) {
        long[] res = new long[n];
        if (n < 1) {
            return res;
        }
        res[0] = 1;
        for (int i = 2; i <= n; i++) {
            res[i - 1] = res[i - 2] * i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(factorial(4)));
    }
}