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
        int num = scanner.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }
        int[] f = new int[num + 1];
        f[0] = 1;
        int temp;
        for (i = 0; i < n; i++) {
            for (int j = num; j >= 0; j--) {
                temp = 0;
                for (int t = l[i]; t < Math.min(j, r[i]); t++) {
                    temp = temp + f[j - t];
                }
                f[j] = temp;
            }
        }
        System.out.println(f[num]);
    }
}
