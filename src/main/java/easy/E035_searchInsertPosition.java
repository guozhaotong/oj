package easy;

/**
 * @author 郭朝彤
 * @date 2017/12/4.
 */
public class E035_searchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        return findIndex(nums,0,nums.length-1, target);
    }

    public int findIndex(int[] nums, int left, int right, int target){
        if(right - left < 4){
            for(int i = 0 ; i < nums.length; i++){
                if(nums[i] >= target)return i;
            }
        }
        int mid = (left + right)/2;
        if(nums[mid] == target) {return mid;}
        if(nums[mid] > target){
            return findIndex(nums, left, mid-1, target);
        }
        else {
            return findIndex(nums, mid+1, right, target);
        }
    }

    public int searchInsert1(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] >= target)return i;
        }
        return nums.length;
    }
}
