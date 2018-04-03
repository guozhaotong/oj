package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/3/27.
 */
public class 跳台阶 {
    public static void main(String[] args) {

    }

    public int JumpFloor(int target) {
        if (target <= 3) {
            return target;
        }
        int[] ints = new int[target + 1];
        ints[0] = 0;
        ints[1] = 1;
        ints[2] = 2;
        ints[3] = 3;
        for (int i = 4; i <= target; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[target];
    }
}
