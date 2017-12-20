package medium;

/**
 * @author 郭朝彤
 * @date 2017/12/19.
 */
public class M055_jumpGame {
    public static boolean canJump(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        if(nums.length == 1){
            return true;
        }
        int count = 0;
        for(int i = nums.length-1; i >= 0; i--){
            while(i >= 0 && nums[i] == 0){
                count++;
                i--;
            }
            while(count > 0 && i >= 0 && nums[i] <= count){
                count++;
                i--;
            }
            if(i + count == nums.length-1){
                if(i == -1 || nums[i] < count){
                    System.out.println(1);
                    return false;
                } else {
                    count = 0;
                }
            }
            if(i == -1){
                System.out.println(2);
                return false;
            }
            count = 0;
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};
        System.out.println(canJump(nums));
    }
}
