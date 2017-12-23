package googleGirl;

import java.util.Scanner;

/**
 * User: tong
 * Date: 2017/12/23
 * Time: 14:15
 */
public class MaxPerfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = (int) Math.floor(Math.sqrt(n));
        System.out.println(num * num);
    }
}
