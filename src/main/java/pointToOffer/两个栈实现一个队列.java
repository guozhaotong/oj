package pointToOffer;

import java.util.Stack;

/**
 * @author 郭朝彤
 * @date 2018/3/27.
 */
public class 两个栈实现一个队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        两个栈实现一个队列 queue = new 两个栈实现一个队列();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(6);
        System.out.println(queue.pop());
    }
}
