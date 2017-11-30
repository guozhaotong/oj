package easy;

import java.util.Stack;

/**
 * @author 郭朝彤
 * @date 2017/11/30.
 */
public class E020_validParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else {
                if(stack.isEmpty())return false;
                char p = stack.peek();
                if(c == ')'){
                    if(p == '('){
                        stack.pop();
                    }
                    else return false;
                }
                if(c == ']'){
                    if(p == '['){
                        stack.pop();
                    }
                    else return false;
                }
                if(c == '}'){
                    if(p == '{'){
                        stack.pop();
                    }
                    else return false;
                }
            }
        }
        if(stack.isEmpty())return true;
        return false;
    }

    public static void main(String[] args){
        Stack<Character> stack = new Stack();
        if(stack.peek() == '1'){
            System.out.println(true);
        }
    }
}
