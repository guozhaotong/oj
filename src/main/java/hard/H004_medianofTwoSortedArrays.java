package hard;

import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class H004_medianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,nums,0,nums1.length);
        System.arraycopy(nums2,0,nums,nums1.length,nums2.length);
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        if(nums.length % 2 == 1){
            return nums[nums.length/2];
        }
        else {
            return (double)  (nums[nums.length/2] + nums[nums.length/2-1])/2;
        }
    }

    public static void main(String[] args){
        System.out.println((double) 3/2);
    }
}
