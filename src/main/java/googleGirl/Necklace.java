package googleGirl;

import java.util.Scanner;

/**
 * User: tong
 * Date: 2017/12/23
 * Time: 16:07
 */
public class Necklace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        int m = scanner.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }
        long[] ans = new long[m + 1];
        ans[0] = 1;
        long temp;
        for (i = 0; i < n; i++) {
            for (int j = m; j >= 0; j--) {
                temp = 0;
                for (int t = l[i]; t <= Math.min(j, r[i]); t++) {
                    temp = temp + ans[j - t];
                }
                ans[j] = temp;
            }
        }
        System.out.println(ans[m]);
    }
}
