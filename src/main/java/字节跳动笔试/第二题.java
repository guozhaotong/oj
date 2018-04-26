package 字节跳动笔试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User: tong
 * Date: 2018/4/15
 * Time: 9:40
 */
public class 第二题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(methods(a, b, m));
    }

    public static int methods(int[] a, int[] b, int m) {
        if (a.length == 0 && b.length == 0) {
            return 0;
        }
        long[][] res = new long[a.length + b.length][m + 1];

        if (b.length != 0) {
            if (b[0] <= m) {
                res[0][b[0]] = 1;
            }
            for (int i = 1; i < b.length; i++) {
                for (int j = 1; j < m + 1; j++) {
                    if (b[i] > j) {
                        res[i][j] = Math.max(res[i - 1][j], res[i - 1][j - b[i]]);
                    } else if (b[i] == j) {
                        res[i][j] = res[i - 1][j] + 1;
                    } else {
                        res[i][j] = res[i - 1][j];
                    }
                }
            }
        }
        if (a.length != 0) {
            if (b.length == 0) {
                res[0][0] = 1;
                for (int i = 1; i < m + 1; i++) {
                    if (i % a[0] == 0) {
                        res[0][i] = 1;
                    }
                }
            } else {
                res[b.length][0] = 1;
                for (int i = 1; i < m + 1; i++) {
                    if (i < a[0]) {
                        res[b.length][i] = res[b.length - 1][i];
                        continue;
//                    }
//                    if(i % a[0] == 0){
//                        res[b.length][i] = Math.max(res[b.length-1][i], res[b.length][i-a[0]])+1;
                    } else {
                        res[b.length][i] = res[b.length - 1][i] + res[b.length][i - a[0]];
                    }
                }
            }
            for (int i = 1; i < a.length; i++) {
                res[b.length + i][0] = 1;
                for (int j = 1; j < m + 1; j++) {
                    if (j < a[i]) {
                        res[b.length + i][j] = res[b.length + i - 1][j];
                        continue;
//                    }
//                    if(j % a[i] == 0){
//                        res[b.length+i][j] = Math.max(res[b.length+i-1][j], res[b.length+i][j-a[i]])+1;
                    } else {
                        res[b.length + i][j] = res[b.length + i - 1][j] + res[b.length + i][j - a[i]];
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(res));
        return (int) (res[a.length + b.length - 1][m] % 1000000007);
    }
}
