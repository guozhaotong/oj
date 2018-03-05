package medium;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2018/3/5.
 */
public class M75_sortColors {
    public void sortColors(int[] nums) {
        int n0 = 0, n1 = 0, n2 = 0;
        for(int i : nums){
            if(i == 0){
                n0++;
            } else if(i == 1){
                n1++;
            }
        }
        Arrays.fill(nums, 0, n0, 0);
        Arrays.fill(nums, n0, n0+n1, 1);
        Arrays.fill(nums, n0+n1, nums.length, 2);
    }
}
