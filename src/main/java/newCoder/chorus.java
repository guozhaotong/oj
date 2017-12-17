package newCoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 郭朝彤
 * @date 2017/12/13.
 */
public class chorus {
    public static int maxProduct(int n, int[] singer, boolean[] valueFind, int k, int d) {
        if (k > n) {
            return 0;
        }
        int product = 1;
        if (n - k + 1 <= d) {
            Arrays.sort(singer);
            for (int i = n - 1; i > n - k - 1; i--) {
                product = product * singer[i];
            }
            return product;
        }
        int max = 0;
        int lastAb = singer[0];
        for (int i = 0; i < n - k + 1; i++) {
            if(!valueFind[i] && singer[i] < lastAb){
                continue;
            }
            lastAb = singer[i];
            max = Math.max(max, maxPro(k,n,d,singer,i,valueFind));
        }

        return max;
    }

    public static int maxPro (int k, int n,  int d, int[] singer, int beginIndex, boolean[] valueFind){
        int product = singer[beginIndex];
        for (int t = 2; t <= k; t++) {
            if (n - beginIndex - t + 1 <= d) {
                int subSinger[] = new int[n - beginIndex];
                System.arraycopy(singer, beginIndex, subSinger, 0, n - beginIndex);
                Arrays.sort(subSinger);
                for (int h = n - beginIndex - 1; h >= n - beginIndex - k + t - 1; h--) {
                    product = product * subSinger[h];
                }
                break;
            }
            beginIndex = maxIndex(singer, beginIndex, d);
            valueFind[beginIndex] = false;
            product = product * singer[beginIndex];
        }
        int max = 0;
        if(product > max){
            max = product;
        }
        return max;
    }

    public static int maxIndex(int[] singer, int curIndex, int d) {
        int max = Integer.MIN_VALUE;
        int maxI = 0;
        for (int j = curIndex + d; j >= curIndex; j--) {
            if (singer[j] > max) {
                max = singer[j];
                maxI = j;
            }
        }
        return maxI;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] singer = new int[n];
        int n = 36;
        String[] strings = "7 -15 31 49 -44 35 44 -47 -23 15 -11 10 -21 10 -13 0 -20 -36 22 -13 -39 -39 -31 -13 -27 -43 -6 40 5 -47 35 -8 24 -31 -24 -1".split(" ");
        int[] singer = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            singer[i] = Integer.valueOf(strings[i]);
        }
        boolean[] valueFind = new boolean[n];
        int k = 3;
        int d = 31;
//        for (int i = 0; i < n; i++) {
//            singer[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        int d = sc.nextInt();
//        System.out.println(maxProduct(n,singer,valueFind, k,d));
    }
}
