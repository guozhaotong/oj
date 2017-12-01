package medium;

/**
 * @author 郭朝彤
 * @date 2017/12/1.
 */
public class M029_divideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if(divisor == 0 || dividend == 0) return 0;
        if(dividend == Integer.MIN_VALUE && divisor == -1)return Integer.MAX_VALUE;
        boolean sign = true;
        if(dividend < 0 && divisor < 0){
            dividend = 0 - dividend;
            divisor = 0 - divisor;
        }
        else if(dividend < 0 && divisor > 0){
            sign = false;
            dividend = 0 - dividend;
        }
        else if(dividend > 0 && divisor < 0){
            sign = false;
            divisor = 0 - divisor;
        }
        int i = 0;
        int sum = 0;
        while(sum <= dividend){
            i++;
            sum += divisor;
        }
        i--;
        if(sign)return i;
        else return 0-i;
    }

    public static void main(String[] args){
        System.out.println((int)(-2147483648/-1));
        System.out.println(divide(-6,3));
    }
}
