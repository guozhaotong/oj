package easy;


import java.util.HashMap;
import java.util.Map;

/**Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author 郭朝彤
 * @date 2017/11/17.
 */
public class E001_twoSum {
    public static void main(String[] args){
        int[] nums  = {2, 7, 11, 15};
        int target = 9;
        int[] a=twoSum(nums ,target);
        System.out.println(a[0] + " " + a[1]);
    }

    /**
     * Solution from tong, time complexity is O(n^2)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        if(nums.length<2){ //异常情况的处理：输入的数组中有不到两个元素
            return indices;
        }
        out:
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){ //这个写的不太好，这里的j是可以从i+1开始循环的
                if(i == j){  //这个问题要避免：不能让同一个位置的元素自己相加
                    continue;
                }
                else if(nums[i]+nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                    break out; //直接跳出大循环
                }
            }
        }
        return indices;
    }

    /**
     * Solution from the website
     * 跟我的思路差不多，时间复杂度跟我的一样，O(n^2),但是人家是从i+1开始循环j的。
     * @param nums
     * @param target
     * @return
     */
    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 用hashMap来找，直接把复杂度降低到O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoPassHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 也是用map来解决，一边存元素一边查看是否找到，复杂度也是O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] onePassHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
