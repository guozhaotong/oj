package 字节跳动笔试;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * User: tong
 * Date: 2018/4/15
 * Time: 9:41
 */
public class 第四题 {
    public static int[] findKth(int[] data, int k) {
        int[] res = new int[2];
        if (k > data.length * (data.length - 1) / 2) {
            res[0] = 0;
            res[1] = 0;
            return res;
        }
        TreeSet<double[]> tree = new TreeSet<>(new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o1[2], o2[2]);
            }
        });
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                double[] tmp = new double[3];
                tmp[0] = data[i];
                tmp[1] = data[j];
                tmp[2] = ((double) data[i] / (double) data[j]);
                tree.add(tmp);
            }
        }
        for (double[] tmp1 : tree) {

            k--;
            if (k == 0) {
                res[0] = (int) tmp1[0];
                ;
                res[1] = (int) tmp1[1];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String size1 = scan.nextLine();
        int size = Integer.parseInt(size1);
        String[] nums = new String[size];
        for (int i = 0; i < size; i++) {
            String nums1 = scan.nextLine();

            String[] tmp = nums1.split(" ");
            int k = Integer.parseInt(tmp[0]);
            int[] num1 = new int[tmp.length - 1];
            for (int j = 1; j < tmp.length; j++) {
                num1[j - 1] = Integer.parseInt(tmp[j]);
            }
            int[] p = findKth(num1, k);
            System.out.println(p[0] + " " + p[1]);
        }
    }
}
