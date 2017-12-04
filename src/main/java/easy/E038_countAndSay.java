package easy;

/**
 * @author 郭朝彤
 * @date 2017/12/4.
 */
public class E038_countAndSay {
    public static String countAndSay(int n) {
        if(n == 0) return "";
        return process(n) ;
    }

    public static String process(int n){
        if(n == 1)return "1";
        String s = "";
        char cur = process(n-1).charAt(0);
        int i = 0;
        for(char c : process(n-1).toCharArray()){
            if(c == cur)i++;
            else {
                s = s + i + "" + cur;
                i = 1;
                cur = c;
            }
        }
        s = s + i + "" + cur;
        return s;
    }
    public static void main(String[] args){
        System.out.println(countAndSay(25));
    }
}
