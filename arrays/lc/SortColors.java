package arrays.lc;

import java.util.PriorityQueue;

class SortColors {
        public void sortColors(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int num : nums){
            heap.add(num);
        }
        int i = 0;
        while(!heap.isEmpty()){
            nums[i] = heap.poll();
            i++;
        }
    }
    
}