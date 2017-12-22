package easy;

/**
 * @author 郭朝彤
 * @date 2017/12/20.
 */
public class E058_lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
//        if(s.length() == 0){
//            return 0;
//        }
        if(s.endsWith(" "))return 0;
        String[] strings = s.split(" ");

        return strings[strings.length-1].length();
    }

    public static void main(String[] args){
        String s = "";
        System.out.println(lengthOfLastWord(s));
    }
}
