package 编程统考2018;

import java.util.Scanner;

/**
 * @author 郭朝彤
 * @date 2018/3/21.
 */
public class 加密 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        gets(s);
    }

    public static void gets(String s) {
        char[] strs = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (char c : strs) {
            if ((c < 'z' && c >= 'a') || (c < 'Z' && c >= 'A')) {
                sb.append((char) (c + 1));
            } else if (c == 'z' || c == 'Z') {
                sb.append((char) (c - 25));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
