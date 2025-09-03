package heaps;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int num : nums){
            if(k > heap.size()){
                heap.add(num);
            }
            else{
                if(num > heap.peek()){
                    heap.remove();
                    heap.add(num);
                }
            }
        }

        return heap.peek();
    }    
}
