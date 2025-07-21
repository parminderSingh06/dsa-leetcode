package stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List<Integer> stack = new ArrayList<>();
    List<Integer> minStack = new ArrayList<>();
    int size = 0;

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.add(val);
        if(size == 0) minStack.add(val);
        else minStack.add(Math.min(val, minStack.get(size-1)));
        size++;
    }
    
    public void pop() {
        size--;
        stack.remove(size);
        minStack.remove(size);
    }
    
    public int top() {
        return stack.get(size-1);
    }
    
    public int getMin() {
        return minStack.get(size-1);
    }
}
