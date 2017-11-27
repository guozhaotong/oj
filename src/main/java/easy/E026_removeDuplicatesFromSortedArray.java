package easy;

/**
 * @author 郭朝彤
 * @date 2017/11/27.
 */
public class E026_removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int len = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
