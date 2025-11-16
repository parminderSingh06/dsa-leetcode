import java.util.HashMap;

public class LongestRepeatingCharacter {

    public int characterReplacement(String s, int k) {
        int answer = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int maxFrequency = 0;

        while(right<s.length()){
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(ch));

            while(((right-left+1) - maxFrequency) > k){
                char leftCh = s.charAt(left);
                map.put(leftCh, map.get(leftCh) - 1);
                left++;
            }
            answer = Math.max(answer, (right-left+1));
            right++;
        }

        return answer;
    }

}