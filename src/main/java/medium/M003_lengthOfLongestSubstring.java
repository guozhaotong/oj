package medium;


import java.util.HashMap;

/**Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * @author 郭朝彤
 * @date 2017/11/20.
 */
public class M003_lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0, j = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                j = Math.max(j, map.get(c));
            }
            map.put(c,i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }

    public static void main(String[] args){
        String s = "dedv";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
