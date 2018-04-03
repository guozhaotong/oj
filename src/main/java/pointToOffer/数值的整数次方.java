package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/2.
 */
public class 数值的整数次方 {
    public static void main(String[] args) {

    }

    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        boolean zheng = true;
        if (exponent < 0) {
            zheng = false;
            exponent *= (-1);
        }
        double res = 1.0;
        for (int i = 0; i < exponent; i++) {
            res = res * base;
        }
        if (!zheng) {
            res = 1 / res;
        }
        return res;
    }
}
