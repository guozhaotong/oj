package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/2.
 */
public class 矩形覆盖 {
    public static void main(String[] args) {

    }

    public int RectCover(int target) {
        if (target <= 2) {
            return Math.max(0, target);
        }
        int[] n = new int[target + 1];
        n[1] = 1;
        n[2] = 2;
        for (int i = 3; i <= target; i++) {
            n[i] = n[i - 1] + n[i - 2];
        }
        return n[target];
    }

}
