package arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int mostCommon = nums[0];
        int count = 1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == mostCommon){
                count++;
            } 
            else{
                if(count == 0){
                    mostCommon = nums[i];
                }
                else{
                    count--;
                }
            }
        }
        return mostCommon;
    }   
}
