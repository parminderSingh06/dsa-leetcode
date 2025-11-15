import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacter {

    public int characterReplacement(String s, int k) {
        int answer = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0, right = 0;

        while(right<s.length()){
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(((right-left+1) - getMaxFrequency(map)) > k){
                char leftCh = s.charAt(left);
                map.put(leftCh, map.get(leftCh) - 1);
                left++;
            }
            answer = Math.max(answer, (right-left+1));
            right++;
        }

        return answer;
    }

    private static int getMaxFrequency(Map<Character,Integer> map){
        int maxFrequency = 0;
        for(Map.Entry<Character,Integer> ch : map.entrySet()){
            maxFrequency = Math.max(maxFrequency, ch.getValue());
        }

        return maxFrequency;
    }
}