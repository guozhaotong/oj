package easy;

/**
 * @author 郭朝彤
 * @date 2017/12/1.
 */
public class E028_implement_strStr {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
