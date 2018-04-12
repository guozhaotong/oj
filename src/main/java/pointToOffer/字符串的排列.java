package pointToOffer;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author 郭朝彤
 * @date 2018/4/4.
 */
public class 字符串的排列 {
    public static void main(String[] args) {
//        System.out.println(Permutation("aa"));
        String s = "";
        String string = "";
        s.equals(string);
        System.out.println(s.substring(0, 0));
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }
        if (str.length() == 1) {
            res.add(str);
            return res;
        }
        TreeSet<StringBuilder> set = new TreeSet<>();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder(chars[0]);
        set.add(sb);
        for (int i = 1; i < chars.length; i++) {
            TreeSet<StringBuilder> tmp = (TreeSet) set.clone();
            for (StringBuilder sbr : tmp) {
                set.remove(sbr);
                for (int j = 0; j <= sbr.length(); j++) {
                    set.add(sbr.insert(j, chars[i]));
                }
            }
        }
        for (StringBuilder sbr : set) {
            res.add(sbr.toString());
        }
        return res;
    }
}
