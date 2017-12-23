import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author 郭朝彤
 * @date 2017/12/22.
 */
public class Accumulation {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        long n = scanner.nextLong();
        System.out.println(res(3).remainder(BigInteger.valueOf(1000000007)));
    }

    public static BigInteger res(long n){
        if(n <= 1){
            return BigInteger.valueOf(0);
        }
        if(n == 2){
            return BigInteger.valueOf(1);
        }
        BigInteger res = res(n-1).multiply(BigInteger.valueOf(2)) .add(multiC(n-1));
        return res;
    }

    public static BigInteger multiC (long n){
        BigInteger res = BigInteger.valueOf(0);
        for(long i = 1; i <= n; i++){
            res = res .add(numOfC(i, n).multiply(BigInteger.valueOf(i)));
        }
        return res;
    }

    public static int[] accumulation(int n){
        int[] res = new int[n];
        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = i + res[i-1] + 1;
        }
        return res;
    }

    public static long[] factorial(long n){
        long[] res = new long[(int) n];
        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = (i+1) * res[i-1];
        }
        return res;
    }

    public static BigInteger numOfC(long up, long down){
        BigInteger res = BigInteger.valueOf(1);
        for(int i = 0; i < up; i++){
            res = res .multiply (BigInteger.valueOf(down - i));
        }
        return res.divide(BigInteger.valueOf(factorial(up)[(int) (up-1)]));
    }
}
