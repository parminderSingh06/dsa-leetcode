package arrays.lc;

public class SortArray {

    public int[] InsertionSortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                int key = nums[i];
                int j = i-1;
                while(j >= 0 && key < nums[j]){
                    nums[j+1] = nums[j];
                    j--;
                }
                nums[j+1] = key;
            }
        }
        return nums;
    }
}
