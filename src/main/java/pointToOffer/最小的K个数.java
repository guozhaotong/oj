package pointToOffer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 郭朝彤
 * @date 2018/4/4.
 */
public class 最小的K个数 {
    public static void main(String[] args) {
        int[] input = {4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(GetLeastNumbers_Solution(input, 1));
        HashMap<String, Integer> map = new HashMap<>();
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length < k || k <= 0) {
            return res;
        }
        if (k == input.length) {
            for (int i : input) {
                res.add(i);
            }
            return res;
        }
        int index = -2;
        int left = 0;
        int right = input.length - 1;
        while (index != k - 1) {
            index = 0;
            while (left < right) {
                while (left < right && input[right] >= input[index]) {
                    right--;
                }
                while (left < right && input[left] <= input[index]) {
                    left++;
                }
                swap(input, left, right);
            }
            swap(input, left, 0);
            index = left;
            if (index < k - 1) {
                swap(input, index + 1, 0);
                left = index;
                right = input.length - 1;
            } else if (index > k - 1) {
                swap(input, index - 1, 0);
                right = index;
                left = 0;
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
