package medium;

import java.util.ArrayList;

/**
 * @author 郭朝彤
 * @date 2017/12/18.
 */
public class M567_permutationInString {
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static boolean checkInclusion(String s1, String s2) {
        for(char c : s1.toCharArray()){
            if(! s2.contains(String.valueOf(c))){
                return false;
            }
        }
        if(s2.length() < s1.length()){
            return false;
        }
        arrange(s1.toCharArray(), 0, s1.length());
        for(String s : arrayList){
            if(s2.contains(s)){
                return true;
            }
        }
        return false;
    }

    public static void arrange(char[] chars, int start, int len){
        if(start + 1 == len){
            arrayList.add(String.valueOf(chars));
        } else {
            for(int i = start; i < len; i++){
                swap(chars, i, start);
                arrange(chars, start+1, len);
                swap(chars, i, start);
            }

        }
    }

    public static void swap(char[] chars, int i, int j){
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

    public static boolean checkInclusion1(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
        }
        String s1s = String.valueOf(s1map);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2map = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s2map[s2.charAt(i + j) - 'a']++;
            }
            String s2s = String.valueOf(s2map);
            if (matches(s1map, s2map)) {
                return true;
            }
        }
        return false;
    }
    public static boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(checkInclusion1("ab", "stractba"));
    }
}
