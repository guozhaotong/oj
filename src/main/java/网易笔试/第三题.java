//package 网易笔试;
//
///**
// * User: tong
// * Date: 2018/3/27
// * Time: 20:38
// */
//public class 第三题 {
//    public static void main(String[] args) {
//
//    }
//
//
//}
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(), m = scanner.nextInt();
//        int[] d = new int[n], p = new int[n];
//        Integer[] idx = new Integer[n];
//
//        for (int i  = 0; i < n; ++i) {
//            d[i] = scanner.nextInt();
//            p[i] = scanner.nextInt();
//            idx[i] = i;
//        }
//
//        int[] a = new int[m];
//        for (int i  = 0; i < m; ++i) {
//            a[i] = scanner.nextInt();
//        }
//        Arrays.sort(a);
//
//        Arrays.sort(idx, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(d[o1], d[o2]);
//            }
//        });
//
//        int psum = 0;
//        int qtail = 0;
//        for (int i = 0; i < m; ++i) {
//            while (qtail < n && d[idx[qtail]] <= a[i]) {
//                psum = Math.max(p[idx[qtail]], psum);
//                ++qtail;
//            }
//            System.out.println(psum);
//        }
//    }
//}
