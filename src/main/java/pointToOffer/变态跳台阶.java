package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/2.
 */
public class 变态跳台阶 {
    public static void main(String[] args) {

    }

    public int JumpFloorII(int target) {
        if (target <= 2) {
            return target;
        }
        int[] ns = new int[target + 1];
        ns[1] = 1;
        ns[2] = 2;
        int sum = 3;
        for (int i = 3; i <= target; i++) {
            ns[i] = sum + 1;
            sum = sum + ns[i];
        }
        return ns[target];
    }
}
