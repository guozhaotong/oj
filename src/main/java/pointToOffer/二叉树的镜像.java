package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/2.
 */
public class 二叉树的镜像 {
    public static void main(String[] args) {

    }

    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
