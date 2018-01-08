package easy;

/**
 * @author 郭朝彤
 * @date 2018/1/8.
 */
public class E067_addBinary {
    public static void main(String[] args) {
        String a = "100";
        String b = "110010";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int lenLong = a.length();
        int lenShort = b.length();
        if (lenLong < lenShort) {
            String temp = a;
            a = b;
            b = temp;
            int t = lenLong;
            lenLong = lenShort;
            lenShort = t;
        }
        int i;
        StringBuilder stringBuilder = new StringBuilder("");
        int carry = 0;
        for (i = lenShort - 1; i >= 0; i--) {
            int t = i+lenLong-lenShort;
            if (a.charAt(i+lenLong-lenShort) == '0' && b.charAt(i) == '0') {
                stringBuilder.append(carry);
                carry = 0;
            } else if (a.charAt(i+lenLong-lenShort) == '1' && b.charAt(i) == '1') {
                stringBuilder.append(carry);
                carry = 1;
            } else {
                stringBuilder.append(1 - carry);
            }
        }
        for (i = lenLong - lenShort - 1; i >= 0; i--) {
            if (a.charAt(i) == '0') {
                stringBuilder.append(carry);
                carry = 0;
            } else {
                stringBuilder.append(1 - carry);
            }
        }
        if (carry == 1) {
            stringBuilder.append("1");
        }
        return stringBuilder.reverse().toString();
    }

}
