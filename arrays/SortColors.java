package arrays;

class SortColors {
    public void sortColors(int[] nums) {
        int right = nums.length-1;
        int left = 0;
        int i = 0;

        while(i <= right){
            if(nums[i] == 0){
                swap(left, i, nums);
                left++;
            }
            else if(nums[i] == 2){
                swap(right, i, nums);
                right--;
                i--;
            }
            i++;
        }

        
    }

    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}