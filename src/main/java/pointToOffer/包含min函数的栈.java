package pointToOffer;

import java.util.Stack;

/**
 * @author 郭朝彤
 * @date 2018/4/3.
 */
public class 包含min函数的栈 {
    public static void main(String[] args) {
    }

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temps = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        stack.push(node);
        if (node < min) {
            min = node;
        }
        temps.push(min);
    }

    public void pop() {
        stack.pop();
        temps.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return temps.peek();
    }
}
