package hard;

/**
 * @author 郭朝彤
 * @date 2017/12/7.
 */
public class H033_searchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
