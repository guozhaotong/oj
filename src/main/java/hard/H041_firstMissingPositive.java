package hard;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2017/12/8.
 */
public class H041_firstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] <= 0){
                continue;
            }
            else if (nums[i] == 1){
                j = 1;
            }
            else {
                if(nums[i] != ++j){
                    return j;
                }
            }
        }
        return j+1;
    }
}
