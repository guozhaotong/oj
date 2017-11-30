package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/11/30.
 */
public class M018_4Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        if(nums.length < 4){
            return res;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            for(int l = nums.length - 1; l > i + 2; l--){
                int j = i + 1;
                int k = l - 1;
                while(j < k){
                    if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        j++;
                        k--;
                        while (j < k && nums[j] == nums[j - 1])j++;
                        while (j < k && nums[k] == nums[k + 1])k--;
                    }
                    else if (nums[i] + nums[j] + nums[k] + nums[l] > target){
                        k--;
                        while (j < k && nums[k] == nums[k + 1])k--;
                    }
                    else {
                        j++;
                        while (j < k && nums[j] == nums[j - 1])j++;
                    }
                }
                while (l > i + 1 && nums[l] == nums[l-1]) l--;
                if(l - 3 < i) break;
            }
            while(i < nums.length - 2 && nums[i] == nums[i+1]) i++;
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {0,4,-5,2,-2,4,2,-1,4};
        System.out.println(fourSum(nums, 12));
    }
}
