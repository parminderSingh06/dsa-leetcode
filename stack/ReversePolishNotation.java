package stack;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length;i++){
            String token = tokens[i];
            if(token.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(token.equals("-")){
                int tempOne = stack.pop();
                int tempTwo = stack.pop();
                stack.push(tempTwo-tempOne);
            }
            else if(token.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(token.equals("/")){
                int tempOne = stack.pop();
                int tempTwo = stack.pop();
                stack.push(tempTwo/tempOne);
            }
            else{
                stack.push(Integer.parseInt(token));
            }

        }

        return stack.pop();
    }
}
