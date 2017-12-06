package medium;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class M012_integerToRoman {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder("");
        String[][] table = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "DM"},
                {"", "M", "MM", "MMM"}
        };
        stringBuilder.append(table[3][num / 1000 % 10]);
        stringBuilder.append(table[2][num / 100 % 10]);
        stringBuilder.append(table[1][num / 10 % 10]);
        stringBuilder.append(table[0][num % 10]);
        return stringBuilder.toString();
    }
}
