package stack;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> firstStack = new Stack<>();
    Stack<Integer> secondStack = new Stack<>();
    
    public void push(int x) {
        if(firstStack.empty()){
            firstStack.add(x);
            return;
        }

        while(!firstStack.empty()){
            secondStack.add(firstStack.pop());
        }
        secondStack.add(x);

        while(!secondStack.empty()){
            firstStack.add(secondStack.pop());
        }
    }
    
    public int pop() {
        return firstStack.pop();
    }
    
    public int peek() {
        return firstStack.peek();
    }
    
    public boolean empty() {
        return firstStack.empty();
    }
}