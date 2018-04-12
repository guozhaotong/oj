package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/4.
 */
public class 二叉搜索树与双向链表 {
    public static void main(String[] args) {

    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null || (pRootOfTree.left == null && pRootOfTree.right == null)) {
            return pRootOfTree;
        }
        TreeNode left = null;
        if (pRootOfTree.left != null) {
            left = Convert(pRootOfTree.left);
            TreeNode treeNode = left;
            while (treeNode.right != null) {
                treeNode = treeNode.right;
            }
            treeNode.right = pRootOfTree;
            pRootOfTree.left = treeNode;
        }
        if (pRootOfTree.right != null) {
            TreeNode right = Convert(pRootOfTree.right);
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        return left == null ? pRootOfTree : left;
    }
}
