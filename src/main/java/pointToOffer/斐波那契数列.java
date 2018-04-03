package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/3/27.
 */
public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(1));
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n - 1];
    }
}
