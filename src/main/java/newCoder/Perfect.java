package newCoder;

import java.util.Scanner;

/**
 * @author 郭朝彤
 * @date 2017/12/22.
 */
public class Perfect {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int small, large, res = 0;
        double low, high;
        for(int i = 0; i < n; i++){
            small = scanner.nextInt();
            large = scanner.nextInt();
            if(small > large){
                System.out.println(0);
            }
            low =  Math.sqrt(small);
            high =  Math.sqrt(large);
            if(low == Math.ceil(low) && high == Math.ceil(high)){
                res = (int) (Math.ceil(high) - Math.ceil(low) + 1);
            }
            else if(low == Math.ceil(low)){
                res = (int) (Math.ceil(high) - Math.ceil(low));
            }else if(high == Math.ceil(high) ){
                res = (int) (Math.ceil(high) - Math.floor(low));
            } else {
                res = (int) (Math.ceil(high) - Math.ceil(low));
            }
            System.out.println(res);
        }
    }
}
