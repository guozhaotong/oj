package googleGirl;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User: tong
 * Date: 2017/12/23
 * Time: 14:49
 */
public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] coin = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            coin[i] = scanner.nextInt();
        }
        Arrays.sort(coin);
        int sum = 0;
        i = 0;
        while (sum < s) {
            sum = sum + coin[i++];
        }
        int num = i;
//        i--;
//        while(sum > s){
//            if(sum - coin[--i] < s)
//            sum = ;
//        }
        i = i - 2;
        while (i >= 0) {
            if (sum - coin[i] >= s) {
                sum = sum - coin[i];
                num--;
            }
            i--;
        }
        System.out.println(num);
    }
}
