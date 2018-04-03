package 排序;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2018/3/26.
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 8, 2, 6, 7, 9};
//        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        for (int i = a.length / 2; i >= 0; i--) {
            heapAdjust(a, i, a.length - 1);
        }
        for (int i = a.length - 1; i >= 0; i--) {
            swap(a, 0, i);
            heapAdjust(a, 0, i - 1);
        }
    }

    public static void heapAdjust(int[] a, int s, int e) {
        int t = a[s];
        for (int i = 2 * s + 1; i <= e; i = i * 2) {
            if (i < e && a[i] < a[i + 1]) {
                i++;
            }
            if (t >= a[i]) {
                break;
            }
            a[s] = a[i];
            s = i;
        }
        a[s] = t;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}