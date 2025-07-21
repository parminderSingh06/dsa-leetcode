package stack;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String string : operations) {
            System.out.println("Current stack is " + stack.toString());
            System.out.println("String is " +string);
            if(string.equals("+") && !stack.empty()){
                int temp = stack.pop();
                int temp2 = stack.peek();
                stack.add(temp);
                stack.add(temp + temp2);
            }

            else if(string.equals("D") && !stack.empty()){
                stack.add(stack.peek()*2);
            }

            else if(string.equals("C") && !stack.empty()){
                stack.pop();
            }

            else{
                int newNum = Integer.parseInt(string);
                stack.add(newNum);
            }
        }
        int answer = 0;
        for(int i=0;i<stack.size();i++){
            System.out.println("Adding " + stack.peek());
            answer += stack.pop();
        }
        return answer;

    }   
}
