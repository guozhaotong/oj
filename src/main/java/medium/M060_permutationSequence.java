package medium;

import java.util.LinkedList;

public class M060_permutationSequence {
    public static String getPermutation(int n, int k) {
        if (n < 1 || k < 1) {
            return "";
        }
        int[] fac = factorial(n);
        if (k > fac[fac.length - 1]) {
            return "";
        }
        LinkedList<Integer> order = array(n);
        StringBuilder stringBuilder = new StringBuilder("");
        int num;
        for (int i = 1; i < n; i++) {
            num = (int) Math.ceil((double) k / fac[n - i - 1]);
            stringBuilder.append(order.get(num - 1) + "");
            order.remove(num - 1);
            k = k - (k - 1) / fac[n - i - 1] * fac[n - i - 1];
        }
        stringBuilder.append(order.get(0) + "");
        return stringBuilder.toString();
    }

    public static int[] factorial(int n) {
        int[] res = new int[n];
        if (n < 1) {
            return res;
        }
        res[0] = 1;
        for (int i = 2; i <= n; i++) {
            res[i - 1] = res[i - 2] * i;
        }
        return res;
    }

    public static LinkedList<Integer> array(int n) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            res.add(i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = array(7);
//        linkedList.remove(3);
//        linkedList.remove(5);
//        System.out.println(linkedList);
        System.out.println(getPermutation(3, 2));
//        System.out.println(Math.ceil((double) 3/2));
    }
}
