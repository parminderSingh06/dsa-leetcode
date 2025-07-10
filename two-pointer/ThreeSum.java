import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        
        //Create the list of lists and sort the orignal array so we can preform the two pointer apporach on the problem.
        List<List<Integer>> answerList = new ArrayList<>();
        Arrays.sort(nums);

        //A loop to run through the numbers one by one which will turn this problem into two pointer as we are locking down one of the numbers.
        for(int i=0;i<nums.length;i++){

            //Skip past a number that we had already locked down because if we dont the same triplet will show up again, take example [-2 -2 0 1 2]. 
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;
            //Two pointer approach
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    answerList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    //if teh same numbers show up for the left pointer we have to mave it because we risk the same triplet being added again, take example: [-1 -1 -1 1 1 2].
                    while(left < right && nums[left] == nums[left-1]){left++;}

                }
            }
        }

        return answerList;
    }
}