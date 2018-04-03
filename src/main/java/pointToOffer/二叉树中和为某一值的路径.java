package pointToOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author 郭朝彤
 * @date 2018/4/3.
 */
public class 二叉树中和为某一值的路径 {
    public static void main(String[] args) {

    }

    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int curSum = 0;
        FindPath(root, target, stack, list, curSum);
        return res;
    }

    public static void FindPath(TreeNode root, int target, Stack<TreeNode> stackOri, ArrayList<Integer> listOri, int curSum) {
        Stack<TreeNode> stack = (Stack<TreeNode>) stackOri.clone();
        ArrayList<Integer> list = (ArrayList<Integer>) listOri.clone();
        stack.push(root);
        list.add(root.val);
        curSum = curSum + root.val;
        if (root.left == null || root.right == null) {
            if (curSum == target) {
                res.add(new ArrayList<Integer>(list));
            }
        }
        if (root.left != null) {
            FindPath(root.left, target, stack, list, curSum);
        }
        if (root.right != null) {
            FindPath(root.right, target, stack, list, curSum);
        }
    }
}
