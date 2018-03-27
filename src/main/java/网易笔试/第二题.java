import java.util.Scanner;

public class 第二题 {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j >= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void test2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (j <= i) {
                if (i % j >= k) {
                    count++;
                }
                j++;
            }
            if (i >= k) {
                count += n - i;
            }
        }

        System.out.println(count);
    }

}