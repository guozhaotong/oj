package medium;

import java.util.*;

/**
 * @author 郭朝彤
 * @date 2017/11/29.
 */
public class M017_letterCombinationsOfAPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        HashMap<Character, char[]> map = makeMap();
        char[] input = digits.toCharArray();
        for(char ci : input){

        }
        return res;
    }

    public static List<String> append(List<String> list){
        return list;
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

    public static void main(String[] args) {
        HashMap<Character, char[]> map = makeMap();
        for (char c : map.get('1')) System.out.println(c);
        for (char c : map.get('2')) System.out.println(c);
        for (char c : map.get('3')) System.out.println(c);
    }
}
