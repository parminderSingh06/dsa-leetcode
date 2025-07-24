public class BinarySearch {
    public int search(int[] nums, int target) {
            int lowIndex = 0;
            int highIndex = nums.length-1;
            int mid = (highIndex + lowIndex) / 2;
            while(highIndex >= lowIndex){
                if(nums[mid] < target){
                    lowIndex = mid + 1;
                }
                else if(nums[mid] > target){
                    highIndex = mid - 1;
                }
                else{
                    return mid;
                }
                mid = (highIndex + lowIndex) / 2;
            }
            return -1;
    }
}
