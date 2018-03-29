package 招商银行信用卡中心笔试;

import java.util.*;

/**
 * User: tong
 * Date: 2018/3/29
 * Time: 19:31
 */
public class 第二题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateParenthesis(n);

    }

    public static void generateParenthesis(int n) {
        if (n <= 0) {
            return;
        }
        TreeMap<String, List<Integer>> map = new TreeMap<>();
        map.put("(", Arrays.asList(1, 0));
        for (int i = 0; i < n * 2 - 2; i++) {
            Set<String> set = new HashSet<>(map.keySet());
            for (String s : set) {
                int f = map.get(s).get(0);
                int l = map.get(s).get(1);
                map.remove(s);
                if (f == l) {
                    map.put(s + "(", Arrays.asList(f + 1, l));
                } else {
                    if (f < n) {
                        map.put(s + "(", Arrays.asList(f + 1, l));
                        map.put(s + ")", Arrays.asList(f, l + 1));
                    } else {
                        map.put(s + ")", Arrays.asList(f, l + 1));
                    }
                }

            }
        }
        StringBuilder stringBuilder = new StringBuilder("");
        for (String s : map.keySet()) {
            stringBuilder.append(s + "),");
//            res.add(s+")");
        }
        System.out.println(stringBuilder.substring(0, stringBuilder.length() - 1).toString());
//        return res;
    }
}
