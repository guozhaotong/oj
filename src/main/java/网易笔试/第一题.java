package 网易笔试;

import java.util.Scanner;

/**
 * User: tong
 * Date: 2018/3/27
 * Time: 20:05
 */
public class 第一题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x1 = new int[n];
        int minX1 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            x1[i] = scanner.nextInt();
            if (x1[i] < minX1) {
                minX1 = x1[i];
            }
        }
        int[] y1 = new int[n];
        int minY1 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            y1[i] = scanner.nextInt();
            if (y1[i] < minY1) {
                minY1 = y1[i];
            }
        }
        int[] x2 = new int[n];
        int maxX2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            x2[i] = scanner.nextInt();
            if (x2[i] > maxX2) {
                maxX2 = x2[i];
            }
        }
        int[] y2 = new int[n];
        int maxY2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            y2[i] = scanner.nextInt();
            if (y2[i] > maxY2) {
                maxY2 = y2[i];
            }
        }
        //(x1,y2)  (x2,y2) (x1,y1)  (x2,y1)
        System.out.println(recoverNum(x1, x2, y1, y2, minX1, minY1, maxX2, maxY2));
    }

    public static int recoverNum(int[] x1, int[] x2, int[] y1, int[] y2, int minX1, int minY1, int maxX2, int maxY2) {
        int maxNum = 0;
        int num = 0;
        for (int i = minX1; i < maxX2; i++) {
            for (int j = minY1; j < maxY2; j++) {
                for (int k = 0; k < x1.length; k++) {
                    if (isCover(x1, x2, y1, y2, k, i, j)) {
                        num++;
                    }
                }
                if (maxNum < num) {
                    maxNum = num;
                }
                if (maxNum == x1.length) {
                    return maxNum;
                }
            }
        }
        return maxNum;
    }

    public static boolean isCover(int[] x1, int[] x2, int[] y1, int[] y2, int no, int tarX, int tarY) {
        if (x1[no] <= tarX && x2[no] > tarX && y1[no] <= tarY && y2[no] > tarY) {
            return true;
        }
        return false;
    }
}
