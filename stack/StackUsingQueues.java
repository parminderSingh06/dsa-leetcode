package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    Queue<Integer> firstQueue = new LinkedList<>();

    Queue<Integer> secondQueue = new LinkedList<>();


    public StackUsingQueues() {
        
    }
    
    public void push(int x) {
        if(firstQueue.isEmpty()){
            firstQueue.add(x);
            while(!secondQueue.isEmpty()){
                firstQueue.add(secondQueue.poll());
            }
            return;
        }
        if(secondQueue.isEmpty()){
            secondQueue.add(x);
            while(!firstQueue.isEmpty()){
                secondQueue.add(firstQueue.poll());
            }
            return;
        }
    }
    
    public int pop() {
        if(firstQueue.isEmpty()){
            return secondQueue.poll();
        }
        else{
            return firstQueue.poll();
        }
    }
    
    public int top() {
        if(firstQueue.isEmpty()){
            return secondQueue.peek();
        }
        else{
            return firstQueue.peek();
        }
    }
    
    public boolean empty() {
        if(firstQueue.isEmpty() && secondQueue.isEmpty()) return true;
        return false;
    }
}
