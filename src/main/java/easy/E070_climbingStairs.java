package easy;

/**
 * @author 郭朝彤
 * @date 2018/1/18.
 */
public class E070_climbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        if(n <= 0){
            return 0;
        }
        if(n <= 3){
            return n;
        }
        int[] res = new int[n];
        res[1] = 2;
        res[2] = 3;
        for(int i = 3; i < n; i++){
            res[i] = res[i-1] + res[i - 2];
        }
        return res[n-1];
    }
}
