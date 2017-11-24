package easy;

/**
 * @author 郭朝彤
 * @date 2017/11/24.
 */
public class E014_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String commonPrefix = strs[0];
        for(String s : strs){
            if(s.length() == 0){
                return "";
            }
            if(s.equals(commonPrefix)){
                continue;
            }
            int i = 0;
            while(i < Math.min(s.length(),commonPrefix.length())){
                if(s.charAt(i) == commonPrefix.charAt(i)){
                    i++;
                }
                else break;
            }
            if(i == 0){
                return "";
            }
            commonPrefix = commonPrefix.substring(0,i);
        }
        return commonPrefix;
    }


}
