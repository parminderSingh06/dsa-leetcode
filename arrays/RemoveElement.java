package arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        
        int currentSize = nums.length;

        int count = 0;

        while(count < currentSize){
            if(nums[count] == val){
                nums[count] = nums[currentSize-1];
                currentSize--;
                continue;
            }
            else{
                count++;
            }
        }

        return currentSize;
    }    
}
