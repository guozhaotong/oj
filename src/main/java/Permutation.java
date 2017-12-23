import java.util.ArrayList;
import java.util.Arrays;

/**排列
 * @author 郭朝彤
 * @date 2017/12/17.
 */
public class Permutation {
    public static ArrayList<String[]> arrayList = new ArrayList<>();
    public static void swap(String[] str, int i, int j)
    {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public static void arrange (String[] str, int st, int len)
    {
        if (st == len - 1)
        {
            String[] strings = new String[len];
            System.arraycopy(str,0,strings,0,len);
            arrayList.add(strings);
        }
        else
        {
            for (int i = st; i < len; i ++)
            {
                swap(str, st, i);
                arrange(str, st + 1, len);
                swap(str, st, i);
            }
        }

    }
    /**
     * @param args
     */
    public static void main(String[] args) {
//        String str[] = {"a","b","c"};
//        arrange(str, 0, str.length);
//        for(String[] strings : arrayList){
//            System.out.println(Arrays.toString(strings));
//        }
        double d = 0.569871687;
        System.out.format("%6f\n", d);
    }
}
