package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/3.
 */
public class 二叉搜索树的后序遍历序列 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        VerifySquenceOfBST(a);
    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        boolean res = (isRight(sequence, 0, sequence.length - 1));
        if (res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return res;
    }

    public static boolean isRight(int[] sequence, int s, int e) {
        if (s > e) {
            return false;
        }
        if (s >= e - 1) {
            return true;
        }
        int i = s;
        for (; i < e && sequence[i] < sequence[e]; i++) {

        }
        int pIndex = i;
        while (i < e) {
            if (sequence[i] < sequence[e]) {
                return false;
            }
            i++;
        }
        if (pIndex == e) {
            return isRight(sequence, s, e - 1);
        }
        if (pIndex == s) {
            return isRight(sequence, s + 1, e - 1);
        }
        return (isRight(sequence, s, pIndex - 1)) && (isRight(sequence, pIndex, e - 1));
    }
}
