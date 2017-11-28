package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/11/28.
 */
public class M015_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return result;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> r = new ArrayList<Integer>();
                        r.add(nums[i]);
                        r.add(nums[j]);
                        r.add(nums[k]);
                        if (!isExist(result, r))
                            result.add(r);
                    }
                }
            }
        }
        return result;
    }

    public static boolean isExist(List<List<Integer>> r, List<Integer> n) {
        if (r.size() == 0) {
            return false;
        }
        List<Integer> rl = r.get(r.size()-1);
        if(rl.get(0) == n.get(0) && rl.get(1) == n.get(1) && rl.get(2) == n.get(2) )
            return true;
        return false;
    }

    public static void print(Object[] a){
        System.out.print("[");
        for(Object i : a){
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return result;
        }
        System.out.println(nums.length);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int len = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != 0){
                if(nums[i] != nums[i-2])
                nums[len++] = nums[i];
            }
            else {
                if(i < 3){
                    nums[len++] = nums[i];
                }
                else if(nums[i] != nums[i-3]){
                    nums[len++] = nums[i];
                }
            }
        }
        System.out.println(len);
        System.out.println(Arrays.toString(nums));
        if (len < 3) {
            return result;
        }
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> r = new ArrayList<Integer>();
                        r.add(nums[i]);
                        r.add(nums[j]);
                        r.add(nums[k]);
                        if(!isExist(result, r))
                        result.add(r);
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> res = threeSum1(nums);
//        for(List<Integer> integers : res){
//            for(int i : res){
//
//            }
//        }
        System.out.println();
        System.out.println(res);
    }
}
