package medium;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2017/11/29.
 */
public class M016_3SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int closeNum = 0;
        int diff = Integer.MAX_VALUE;
        System.out.println(diff);
        int v = 0;
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    v = Math.abs(nums[i] + nums[j] + nums[k] - target);
                    if(v == 0)return (nums[i] + nums[j] + nums[k]);
                    if(v < diff){
                        diff = v;
                        closeNum = nums[i] + nums[j] + nums[k];
                        System.out.println(closeNum);
                    }
                    if(k != nums.length-1 && nums[k] == nums[k+1])k++;
                }
                if(j != nums.length-2 && nums[j] == nums[j+1])j++;
            }
            if(i != nums.length-3 && nums[i] == nums[i+1])i++;
        }
        return closeNum;
    }

    public static void main(String[] args){
        int[] nums = {0,1,2};
        System.out.println(threeSumClosest(nums, 3));
    }
}
