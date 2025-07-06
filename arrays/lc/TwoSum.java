package arrays.lc;

import java.util.HashMap;

public class TwoSum {

    public int[] bruteForce(int[] nums, int target){

    }

    public int[] hashMap(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i: nums){
            if(map.containsKey(target - ans[i])){
                ans[0] = i;
                ans[1] = map.get(target-ans[i]);
            }
            else{
                map.put(target-ans[i], i);
            }
        }
        return ans;
    }
}

