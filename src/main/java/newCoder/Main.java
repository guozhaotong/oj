package newCoder;

import java.util.Scanner;

/**
 * Created by dearc on 2017/12/22.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int times = Integer.parseInt(str);
        int output_arr[] = new int[times];
        for (int tmp_times = 0; tmp_times < times; tmp_times++) {
            String string = scan.nextLine();
            int l_num = Integer.parseInt(string.split(" ")[0]);
            int r_num = Integer.parseInt(string.split(" ")[1]);
            int count = 0;
            count = (int)(Math.floor(Math.sqrt(r_num))-Math.ceil(Math.sqrt(l_num))+1);
//            for (int i = l_num; i <= r_num; i++) {
//                for (int n = (int)Math.sqrt(l_num); n <= (int)Math.sqrt(r_num); n++) {
//                    if (n * n == i) {
//                        count++;
//                    }
//                }
//            }
            output_arr[tmp_times] = count;
        }
        for(int i = 0 ;i<output_arr.length;i++){
            System.out.println(output_arr[i]);
        }

    }
}