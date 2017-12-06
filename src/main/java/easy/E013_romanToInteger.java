package easy;

import java.util.HashMap;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class E013_romanToInteger {
    public static int romanToInt(String s) {
        if(s.length() == 0){
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        char[] chars = s.toCharArray();
        int i = hashMap.get(chars[0]);
        for(int j = 1; j < chars.length; j++){
            int k = hashMap.get(chars[j]);
            int t = hashMap.get(chars[j-1]);
            i += k;
            if(k > t){
                i -= (2*t);
            }
        }
        return i;
    }
    public static void main(String[] args){
        System.out.println(romanToInt("MMMDLXXXVI"));
    }
}
