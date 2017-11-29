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
        if(r.size() == 1){
            if((r.get(0).get(0) == n.get(0)) && (r.get(0).get(1) == n.get(1)) && (r.get(0).get(2) == n.get(2))) {
                return true;
            }
            else return false;
        }
        List<Integer> rl = r.get(r.size()-1);
        List<Integer> rm = r.get(r.size()-2);
        if((rl.get(0) == n.get(0) && rl.get(1) == n.get(1) && rl.get(2) == n.get(2)) || (rm.get(0) == n.get(0) && rm.get(1) == n.get(1) && rm.get(2) == n.get(2)) )
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
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                    while ((k < nums.length - 1) && (nums[k] == nums[k+1])){
                        k++;
                    }
                }
                while ((j < nums.length - 2) && (nums[j] == nums[j+1])){
                    j++;
                }
            }
            while ((i < nums.length - 3) && (nums[i] == nums[i+1]) ){
                i++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,4,1,3,0,3,-2,1,-2,2,-1,1,-5,4,-3};
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
