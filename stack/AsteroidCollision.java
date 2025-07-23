package stack;

import java.util.Stack;

public class AsteroidCollision{

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> rightStack = new Stack<>();
        Stack<Integer> leftStack = new Stack<>();

        for(int asteroid : asteroids){
            if(asteroid > 0) rightStack.push(asteroid);
            else if(asteroid < 0) leftStack.push(asteroid);
        }

        while(!rightStack.empty() && !leftStack.empty()){
            int rightValue = Math.abs(rightStack.peek());
            int leftValue = Math.abs(leftStack.peek());
            if(rightValue == leftValue){
                rightStack.pop();
                leftStack.pop();
            }

            else if (rightValue<leftValue) {
                rightStack.pop();
            }

            else{
                leftStack.pop();
            }
        }

        int[] answer;
        if(leftStack.empty()){
            answer = new int[rightStack.size()];
            int count = rightStack.size()-1;
            while(!rightStack.empty()){
                answer[count--] = rightStack.pop();
            }
        }
        else{
            answer = new int[leftStack.size()];
            int count = leftStack.size()-1;
            while(!leftStack.empty()){
                answer[count--] = leftStack.pop();
            }
        }

        return answer;
    }
}