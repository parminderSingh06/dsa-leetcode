package arrays;

import java.util.HashMap;

class TwoSum {

    public int[] bruteForce(int[] nums, int target){
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
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

