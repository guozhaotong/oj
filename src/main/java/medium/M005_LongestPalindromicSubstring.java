package medium;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * <p>
 * Example:
 * Input: "cbbd"
 * Output: "bb"
 *
 * @author 郭朝彤
 * @date 2017/11/21.
 */
public class M005_LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String maxSubString = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            // 以一个字母对称
            for (int j = 1; j <= Math.min(i, s.length() - i - 1); j++) {
                if (s.charAt(i - j) != s.charAt(i + j)) {
                    break;
                }
                if (maxSubString.length() < 2 * j + 1) {
                    maxSubString = s.substring(i - j, i + j + 1);
                }
            }
            //以两个字母对称
            if (i == s.length() - 1) {
                break;
            }
            if (s.charAt(i) != s.charAt(i + 1)) {
                continue;
            }
            if (maxSubString.length() < 2) {
                maxSubString = s.substring(i, i + 2);
            }
            for (int j = 1; j <= Math.min(i, s.length() - i - 2); j++) {
                if (s.charAt(i - j) != s.charAt(i + j + 1)) {
                    break;
                }
                if (maxSubString.length() < 2 * j + 2) {
                    maxSubString = s.substring(i - j, i + j + 2);
                }
            }
        }
        return maxSubString;
    }

    public static void main(String[] args) {
        String s = "aaaaaa";
        System.out.println(longestPalindrome(s));
    }
}
