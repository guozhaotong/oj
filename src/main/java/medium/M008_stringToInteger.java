package medium;


/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class M008_stringToInteger {
    public static int myAtoi(String str) {
        StringBuilder s = new StringBuilder(str.trim());
        if (s.length() == 0) {
            return 0;
        }
        char[] chars = s.toString().toCharArray();
        for (int i = 0; i < Math.min(chars.length, 13); i++) {
            if (i == 0) {
                if (chars[i] == '+' || chars[i] == '-') {
                    continue;
                } else if (chars[i] >= '0' && chars[i] <= '9') {
                    continue;
                } else {
                    return 0;
                }
            }
            if(!(chars[i] >= '0' && chars[i] <= '9')){
                s.delete(i,s.length());
                break;
            }
        }
        if(s.length() == 1 && (s.toString().equals("+") || s.toString().equals("-"))){
            return 0;
        }
        if(s.length() > 11){
            s.delete(12,s.length());
        }
        long l = Long.parseLong(s.toString());
        if(l > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(l < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        String str = "+";
        System.out.println(myAtoi(str));
//        System.out.println(Integer.parseInt(str)/10);
    }
}
