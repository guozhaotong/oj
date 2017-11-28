package easy;

/**
 * @author 郭朝彤
 * @date 2017/11/28.
 */
public class E007_reverseInteger {
    public static int reverse(int x) {
        if(x >= 0 && x <= 9){
            return x;
        }
        StringBuffer sb = new StringBuffer("");
        sb.append(x+"");
        if(x < 0){
            System.out.println("no");
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
        StringBuffer nsb = sb.reverse();
        System.out.println(nsb);
        long nx = Long.parseLong(nsb.toString());
        if(x < 0){
            nx = nx * (-1);
        }
        if(nx > 2147483647){
            return 0;
        }
        if(nx < -2147483648){
            return 0;
        }
        return (int) nx;
    }

    public static int reverse2(int x) {
        int output = 0;

        while (true) {
            if (x == 0) {
                return x;
            }

            output = output * 10 + x % 10;

            System.out.println(x % 10);
            if ((x /= 10) == 0) {
                return output;
            }

            if (output > 214748364 || output < -214748364) {
                return 0;
            }
        }
    }

    public static int reverse3(int x){
        long nx = 0;
        if(x >= 0 && x <= 9){
            return x;
        }
        while(x < -9 || x > 9){
            nx = nx * 10 + x % 10;
            x = x / 10;
        }
        nx = nx * 10 + x;
        if(nx > Integer.MAX_VALUE || nx < Integer.MIN_VALUE){
            return 0;
        }
        return (int) nx;
    }

    public static void main(String[] args){
        int i = -2147483648;
        System.out.println(reverse3(i));
    }
}
