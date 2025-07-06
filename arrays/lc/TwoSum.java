package arrays.lc;

import java.util.HashMap;

public class TwoSum {

    public int[] bruteForce(int[] nums, int target){
        int[] ans = new int[2];
        //Implement brute force.
        return ans;
    }

    public int[] hashMap(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<nums.length;i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                ans[0] = i;
                ans[1] = map.get(diff);
                return ans;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}

