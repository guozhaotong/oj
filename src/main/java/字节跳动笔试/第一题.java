package 字节跳动笔试;

import java.util.Scanner;

/**
 * User: tong
 * Date: 2018/4/15
 * Time: 9:40
 */
public class 第一题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            System.out.println(zhouqi(a));
        }
    }

    public static int zhouqi(int[] a) {
        return 1;
    }
}
