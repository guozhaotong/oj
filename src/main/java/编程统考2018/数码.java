package 编程统考2018;

import java.util.ArrayList;

/**
 * @author 郭朝彤
 * @date 2018/3/21.
 */
public class 数码 {
    public static void main(String[] args) {
        System.out.println(getyueshu(2));
    }

    public static int[] yueshu(int l, int r) {
        int[] answer = new int[9];
        if (l == 1) {
            answer[0] = -1;
        }
        for (int i = l; i <= r; i++) {
            answer[0] = answer[0] + 1;
            ArrayList<Integer> arrayList = getyueshu(l);
            for (int j : arrayList) {
                int gao = getGao(j);
                answer[gao - 1] = answer[gao - 1] + 1;
            }
            int gao = getGao(i);
            answer[gao - 1] = answer[gao - 1] + 1;
        }
        return answer;
    }

    public static ArrayList<Integer> getyueshu(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n + 1); i++) {
            if (n % i == 0) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static int getGao(int n) {
        String s = n + "";
        char c = s.charAt(0);
        int gao = c - '0';
        return gao;
    }
}
