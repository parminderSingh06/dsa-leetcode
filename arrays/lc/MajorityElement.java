package arrays.lc;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        int mostCommon = nums[0];

        for(int i=1;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) > map.get(mostCommon)){
                mostCommon = nums[i];
            }
        }

        return mostCommon;
    }   
}
