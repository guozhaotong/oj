package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/3/19.
 */
public class 左右子树交换 {
    public static void main(String[] args) {

    }

    public ListTree swapLeftRight(ListTree listTree) {
        if (listTree == null || (listTree.left == null && listTree.right == null)) {
            return listTree;
        }
        ListTree temp = listTree.right;
        listTree.right = listTree.left;
        listTree.left = temp;
        swapLeftRight(listTree.left);
        swapLeftRight(listTree.right);
        return listTree;
    }
}

class ListTree {
    int value;
    ListTree left;
    ListTree right;

    public void ListNode(int value) {
        this.value = value;
    }
}


