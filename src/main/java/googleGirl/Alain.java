package googleGirl;

import java.util.Scanner;

/**
 * User: tong
 * Date: 2017/12/23
 * Time: 15:37
 */
public class Alain {
    static int n;
    static int k;
    static int answer;
    static int[] choice = {0, 0, 0, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        System.out.println(n + " " + k);
        int[][] r = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                r[i][j] = scanner.nextInt();
            }
        }
        k = Math.min(k, 5);
        fight(r, 0);
        System.out.println(answer);
    }

    public static void fight(int[][] r, int num) {
        int i, j;
        if (num == 5) {
            int[] value = new int[k];
            for (i = 0; i < k; i++) {
                value[i] = 0;
            }
            for (i = 0; i < n; i++) {
                int[] myValue = new int[5];
                for (j = 0; j < 5; j++) {
                    myValue[choice[j]] = myValue[choice[j]] + r[i][j];
                }
                for (j = 0; j < k; j++) {
                    value[j] = Math.max(value[j], myValue[j]);
                }
            }
            int ansTemp = 0;
            for (j = 0; j < k; j++) {
                ansTemp = ansTemp + value[j];
            }
            answer = Math.max(ansTemp, answer);
        } else {
            for (i = 0; i < k; i++) {
                choice[num] = i;
                fight(r, num + 1);
            }
        }
    }
}
