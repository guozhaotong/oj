package pointToOffer;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 郭朝彤
 * @date 2018/4/2.
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class 树的子结构 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(7);
        TreeNode t3 = new TreeNode(2);
        t3.left = t1;
        t3.right = t2;
        TreeNode t4 = new TreeNode(9);
        TreeNode t5 = new TreeNode(8);
        t5.left = t4;
        t5.right = t3;
        TreeNode t6 = new TreeNode(7);
        TreeNode root1 = new TreeNode(8);
        root1.left = t5;
        root1.right = t6;

        TreeNode t7 = new TreeNode(9);
        TreeNode t8 = new TreeNode(2);
        TreeNode root2 = new TreeNode(8);
        root2.left = t7;
        root2.right = t8;
        System.out.println(HasSubtree(root1, root2));
    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root1);
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            if (sameTree(t, root2)) {
                return true;
            }
            if (t.left != null) {
                q.offer(t.left);
            }
            if (t.right != null) {
                q.offer(t.right);
            }
        }
        return false;
    }

    public static boolean sameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return false;
        }
        if (root1 == root2) {
            return true;
        }
        if ((root1 != null && root2 == null) || (root1 == null && root2 != null) || (root1.val != root2.val)) {
            return false;
        }
        Queue<Pair<TreeNode, TreeNode>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root1, root2));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (((TreeNode) pair.getKey()).val != ((TreeNode) pair.getValue()).val) {
                return false;
            }
            if (((TreeNode) pair.getValue()).left != null) {
                queue.offer(new Pair<>(((TreeNode) pair.getKey()).left, ((TreeNode) pair.getValue()).left));
            }

            if (((TreeNode) pair.getValue()).right != null) {
                queue.offer(new Pair<>(((TreeNode) pair.getKey()).right, ((TreeNode) pair.getValue()).right));
            }
        }
        return true;
    }
}
