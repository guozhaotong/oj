package pointToOffer;

import java.util.ArrayList;

/**
 * @author 郭朝彤
 * @date 2018/4/12.
 */
public class 和为S的连续正数序列 {
    public static void main(String[] args) {
        FindContinuousSequence(3);
    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low = 1;
        for (int s = (int) Math.sqrt(sum * 2); s <= sum; s++) {
            int e = low;
            while (true) {
                if (e == s) {
                    break;
                }
                if (s * s - e * e + s + e == sum * 2) {
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int i = e; i <= s; i++) {
                        list.add(i);
                    }
                    res.add(list);
                    System.out.println(list);
                    low = e;
                    break;
                }
                if (s * s - e * e + s + e < sum * 2) {
                    low = e - 1;
                    break;
                }
                e++;
            }
        }
        return res;
    }
}
