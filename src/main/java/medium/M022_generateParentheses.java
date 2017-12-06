package medium;

import java.util.*;

/**
 * @author 郭朝彤
 * @date 2017/12/1.
 */
public class M022_generateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }
        HashMap<String, List<Integer>> map = new HashMap<>();
        map.put("(", Arrays.asList(1, 0));
        for (int i = 0; i < n*2-2; i++) {
            Set<String> set = new HashSet<>(map.keySet());
            for (String s : set) {
                int f = map.get(s).get(0);
                int l = map.get(s).get(1);
                map.remove(s);
                if(f == l){
                    map.put(s+"(", Arrays.asList(f+1, l));
                } else{
                    if(f < n){
                        map.put(s+"(", Arrays.asList(f+1, l));
                        map.put(s+")", Arrays.asList(f,l+1));
                    }
                    else {
                        map.put(s+")", Arrays.asList(f, l+1));
                    }
                }

            }
        }
        for(String s : map.keySet()){
            res.add(s+")");
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(generateParenthesis(8));
    }
}
