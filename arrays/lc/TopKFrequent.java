package arrays.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int currentNumber = nums[i];
            if(map.containsKey(currentNumber)){
                int value = map.get(currentNumber);
                map.put(currentNumber, value+1);
            }
            else{
                map.put(currentNumber,1);
            }

        }
        
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        for(int i=0;i<k;i++){
            answer[i] = entries.get(i).getKey();
        }
        return answer;
    }
    
}