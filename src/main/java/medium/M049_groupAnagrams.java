package medium;

import java.util.*;

/**
 * @author 郭朝彤
 * @date 2017/12/5.
 */
public class M049_groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String string = Arrays.toString(chars);
            if(map.containsKey(string)){
                ArrayList<String> arrayList = map.get(string);
                arrayList.add(s);
                map.put(string, arrayList);
            }
            else {
                ArrayList<String> aList = new ArrayList<>();
                aList.add(s);
                map.put(string, aList);
            }
        }
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            res.add((List<String>) entry.getValue());
        }
        return res;
    }
}
