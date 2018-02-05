package googleGirl;

import java.util.Scanner;

/**
 * User: tong
 * Date: 2017/12/23
 * Time: 15:12
 */
public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (p[i] == i + 1) {
                swap(p, i, i + 1);
                count++;
            }
        }
        if (p[n - 1] == n) {
            count++;
        }
        System.out.println(count);
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
