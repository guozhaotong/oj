package easy;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2018/1/2.
 */
public class E066_plusOne {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        if(len == 0){
            return digits;
        }
        if(digits[len-1] != 9){
            digits[len-1] += 1;
            return digits;
        }
        digits[len-1] = 0;
        int carry = 1;
        for(int i = len-2; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[len+1];
//        Arrays.fill(newDigits, 0);
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] a = {3,5};
        System.out.println(Arrays.toString(plusOne(a)));
    }
}
