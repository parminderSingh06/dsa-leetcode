package stack;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> firstStack = new Stack<>();
    Stack<Integer> secondStack = new Stack<>();
    
    public void push(int x) {
        firstStack.add(x);
    }
    
    public int pop() {
        if(secondStack.empty()){
            while(!firstStack.empty()){
                secondStack.add(firstStack.pop());
            }
        }
        return secondStack.pop();
    }
    
    public int peek() {
        if(secondStack.empty()){
            while(!firstStack.empty()){
                secondStack.add(firstStack.pop());
            }
        }
        return secondStack.peek();
    }
    
    public boolean empty() {
        return firstStack.empty() && secondStack.empty();
    }
}