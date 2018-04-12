package pointToOffer;

import java.util.Arrays;
import java.util.List;

/**
 * @author 郭朝彤
 * @date 2018/4/11.
 */
public class 把数组排成最小的数 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 3, 32, 34, 7, 12, 7, 2, 123, 12333);
        list.sort((i, j) -> {
            long x = Long.parseLong(i + "" + j);
            long y = Long.parseLong(j + "" + i);
            return Long.compare(x, y);
        });
        System.out.println(list);
        int[] aaa = new int[]{1, 2, 3, 6, 4};

    }

    public String PrintMinNumber(int[] numbers) {
        Integer[] integers = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            integers[i] = numbers[i];
        }
        Arrays.sort(integers, (i, j) -> (i + "" + j).compareTo(j + "" + i));
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i : integers) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

}
