package pointToOffer;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2018/4/12.
 */
public class 第一个只出现一次的字符 {
    public static void main(String[] args) {

    }

    public int FirstNotRepeatingChar(String str) {
        int[] zimu = new int[26 * 2];
        Arrays.fill(zimu, -1);
        char[] chars = str.toCharArray();
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            j = chars[i] - 'a';
            if (j < 0) {
                j = chars[i] - 'A' + 26;
            }
            if (zimu[j] == -1) {
                zimu[j] = i;
            } else {
                zimu[j] = -2;
            }
        }
        Arrays.sort(zimu);
        for (int i : zimu) {
            if (i >= 0) {
                return i;
            }
        }
        return -1;
    }
}
