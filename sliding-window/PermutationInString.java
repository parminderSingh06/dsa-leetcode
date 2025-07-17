import java.util.HashMap;
import java.util.Map;


public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> temp = new HashMap<>();
        int left = 0, right = 0;

        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
        }

        while(right < s2.length()){
            char currentChar = s2.charAt(right);
            temp.put(currentChar, temp.getOrDefault(currentChar, 0)+1);

            if(right-left + 1 > s1.length()){
                char leftChar = s2.charAt(left);
                temp.put(leftChar, temp.getOrDefault(leftChar, 0)-1);
                if(temp.get(leftChar) == 0) temp.remove(leftChar);
                left++;
            }

            if(map.equals(temp))return true;

            right++;
        }

        return false;
    }
}
