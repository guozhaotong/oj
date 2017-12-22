package newCoder;

import java.util.Scanner;

/**
 * @author 郭朝彤
 * @date 2017/12/22.
 */
//public class Match {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double a[] = new double[12];
//        double b[] = new double[12];
//        double c[] = new double[12];
//        int i = 0;
//        for (i = 0; i < 12; i++) {
//            a[i] = scanner.nextDouble();
//        }
//        for (i = 0; i < 12; i++) {
//            b[i] = scanner.nextDouble();
//        }
//        for (i = 0; i < 12; i++) {
//            c[i] = scanner.nextDouble();
//        }
//        for(i = 0; i < 12; i++){
//            System.out.format("%6f",(1 - (1-a[i])*(1-b[i])*(1-c[i])));
//        }
//    }
//}

import java.util.Scanner;
import java.text.*;
public class Match
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double[] res = new double[12];

        double[] a = new double[12];
        double[] b = new double[12];
        double[] c = new double[12];//input

        String a_string = scan.nextLine();
        String b_string = scan.nextLine();
        String c_string = scan.nextLine();


        for(int i = 0; i<12; i++)
        {
            a[i] = Double.parseDouble(a_string.split(" ")[i]);
            b[i] = Double.parseDouble(b_string.split(" ")[i]);
            c[i] = Double.parseDouble(c_string.split(" ")[i]);
            res[i] = a[i] + (1-a[i]) * (b[i] + (1-b[i])*c[i]);
        }
        double[] f = new double[13];
        f[0] = 1;
        for (int i = 1; i <= 12; ++i) {
            f[i] = 0;
        }

        for (int i = 0; i < 12; ++i) {
            for (int j = 12; j > 0; --j) {
                f[j] = res[i] * f[j-1] + (1-res[i]) * f[j];
            }
            f[0] = (1-res[i]) * f[0];
        }

        for(int k=0;k<13;k++)
        {
            System.out.println(String.format("%.6f",f[k]));
        }
    }
}