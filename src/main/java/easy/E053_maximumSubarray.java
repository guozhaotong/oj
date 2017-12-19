package easy;

/**
 * @author 郭朝彤
 * @date 2017/12/19.
 */
public class E053_maximumSubarray {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i < nums.length && nums[i] <= 0){
            if(nums[i] > max){
                max = nums[i];
            }
            i++;
        }
        int sum = 0;
        for(;i < nums.length; i++){
            sum = sum + nums[i];
            if (sum < 0){
                sum = 0;
            } else if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums = {-1,-2,1,3,-5,1,6};
        System.out.println(maxSubArray(nums));
    }
}
