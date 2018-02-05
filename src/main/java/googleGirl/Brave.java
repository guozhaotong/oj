package googleGirl;

import java.util.Scanner;

/**
 * User: tong
 * Date: 2017/12/23
 * Time: 14:21
 */
public class Brave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder("");
        while (n != 0) {
            if (n % 2 == 0) {//偶数
                n = G(n);
                stringBuilder.append("G");
            } else {//奇数
                n = N(n);
                stringBuilder.append("N");
            }
        }
        System.out.println(stringBuilder.reverse().toString());
    }

    public static int N(int x) {
        return (x - 1) / 2;
    }

    public static int G(int x) {
        return (x - 2) / 2;
    }
}
