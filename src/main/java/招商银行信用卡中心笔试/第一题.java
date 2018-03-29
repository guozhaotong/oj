package 招商银行信用卡中心笔试;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User: tong
 * Date: 2018/3/29
 * Time: 19:51
 */
public class 第一题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        judge(string);
//        judge("abcabcabc");
    }

    public static void judge(String string) {
        int len = string.length();
        if (string == null || len < 2) {
            System.out.println(false);
        }
        char[] chars = string.toCharArray();
        char start = chars[0];
        List<Integer> symble = new ArrayList<>();
        for (int i = 1; i < chars.length / 2 + 2; i++) {
            if (chars[i] == start) {
                symble.add(i);
            }
        }
        for (int i : symble) {
            String s = string.substring(0, i);
            int l = s.length();
            if (len % l != 0) {
                break;
            }
            int st = i;
            int end = i + i;
            boolean done = true;
            while (end <= len) {
                if (!string.substring(st, end).equals(s)) {
                    done = false;
                    break;
                }
                st = end;
                end = end + i;
            }
            if (done) {
                System.out.println(s);
                return;
            }
        }
        System.out.println(false);
    }
}
