package 网易笔试;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author 郭朝彤
 * @date 2018/3/27.
 */
public class 第三题 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] d = new int[n], p = new int[n];
        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; ++i) {
            d[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
            idx[i] = i;
        }

        int[] a = new int[m];
        Integer[] idxa = new Integer[m];
        for (int i = 0; i < m; ++i) {
            a[i] = scanner.nextInt();
            idxa[i] = i;
        }
        Arrays.sort(idxa, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(a[o1], a[o2]);
            }
        });

        Arrays.sort(idx, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(d[o1], d[o2]);
            }
        });

        int psum = 0;
        int qtail = 0;
        int[] ans = new int[m];
        for (int i = 0; i < m; ++i) {
            while (qtail < n && d[idx[qtail]] <= a[idxa[i]]) {
                psum = Math.max(p[idx[qtail]], psum);
                ++qtail;
            }
            ans[idxa[i]] = psum;
        }

        for (int i = 0; i < m; ++i) {
            System.out.println(ans[i]);
        }
    }
}
