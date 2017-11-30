package medium;

import java.util.*;

/**
 * @author 郭朝彤
 * @date 2017/11/29.
 */
public class M017_letterCombinationsOfAPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        List<String> newRes = new ArrayList<String>();
        HashMap<Character, char[]> map = makeMap();
        char[] input = digits.toCharArray();
        for(char ci : input){
            if(res.size() == 0){
                for(char cm : map.get(ci)){
                    newRes.add(String.valueOf(cm));
                }
            }
            else {
                for(String s : res){
                    for (char cm : map.get(ci)){
                        newRes.add(s+cm);
                    }
                }
            }
            res = new ArrayList<String>(newRes);
            newRes = new ArrayList<String>();
        }
        return res;
    }
    public static void main(String[] args) {
        List<String> list = letterCombinations("23");
        System.out.println(list);
    }

    public static HashMap<Character, char[]> makeMap() {
        HashMap<Character, char[]> map = new HashMap<Character, char[]>();
        char[] chars = {};
        map.put('1', chars);
        map.put('#', chars);
        chars = new char[]{'a', 'b', 'c'};
        map.put('2', chars);
        chars = new char[]{'d', 'e', 'f'};
        map.put('3', chars);
        chars = new char[]{'g', 'h', 'i'};
        map.put('4', chars);
        chars = new char[]{'j', 'k', 'l'};
        map.put('5', chars);
        chars = new char[]{'m', 'n', 'o'};
        map.put('6', chars);
        chars = new char[]{'p', 'q', 'r', 's'};
        map.put('7', chars);
        chars = new char[]{'t', 'u', 'v'};
        map.put('8', chars);
        chars = new char[]{'w', 'x', 'y', 'z'};
        map.put('9', chars);
        chars = new char[]{' '};
        map.put('0', chars);
        chars = new char[]{'+'};
        map.put('*', chars);
        return map;
    }
}
