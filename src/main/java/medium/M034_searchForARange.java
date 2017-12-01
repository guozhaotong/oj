package medium;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2017/12/1.
 */
public class M034_searchForARange {
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[] {-1, -1};
        }
        int index = searchLocation(nums,0,nums.length-1, target);
        int l = index;
        int r = index;
        if(index == -1) return new int[] {-1, -1};
        else {
            while (l >= 0 && nums[l] == target)l--;
            l++;
            while (r <= nums.length-1 && nums[r] == target)r++;
            r--;
        }
        return new int[] {l, r};
    }

    public static int searchLocation(int[] nums, int left, int right, int target){
        if(left >= right - 1){
            if(nums[left] == target)return left;
            else if(nums[right] == target)return right;
            else return -1;
        }
        int mid = (left + right) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return searchLocation(nums, left, mid-1, target);
        else return searchLocation(nums, mid+1, right, target);
    }

    public static void main(String[] args){
        int[] nums = {1};
        System.out.println(Arrays.toString(searchRange(nums, 0)));
    }
}
