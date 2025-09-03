package heaps;

import java.util.PriorityQueue;

public class KthLargest {
    
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int kth;
    public KthLargest(int k, int[] nums) {
        for(int num : nums){
            minHeap.add(num);
        }
        kth = k;
        while(kth < minHeap.size()){
            minHeap.remove();
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(kth < minHeap.size()){
            minHeap.remove();
        }
        return minHeap.peek();
    }
}
