package pointToOffer;

import java.util.Stack;

/**
 * @author 郭朝彤
 * @date 2018/4/3.
 */
public class 栈的压入弹出序列 {
    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {5, 4, 3, 2, 1};
        System.out.println(IsPopOrder(pushA, popA));
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (; i < pushA.length; i++) {
            if (pushA[i] == popA[0]) {
                break;
            } else {
                stack.push(pushA[i]);
            }
        }
        int j = 1;
        i++;
        while (j < popA.length) {
            if (popA[j] == stack.peek()) {
                j++;
                stack.pop();
            } else {
                if (i < pushA.length) {
                    stack.push(pushA[i]);
                    i++;
                } else {
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
