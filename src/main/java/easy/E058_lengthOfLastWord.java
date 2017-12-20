package easy;

/**
 * @author 郭朝彤
 * @date 2017/12/20.
 */
public class E058_lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }
        return s.split(" ")[s.split(" ").length - 1].length();
    }
}
