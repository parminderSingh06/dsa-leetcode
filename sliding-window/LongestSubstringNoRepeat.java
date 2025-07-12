import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeat {

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        int longestSubStringLength = 0;

        char[] givenString = s.toCharArray();

        Set<Character> set = new HashSet<>();

        int left = 0, right = 0;

        while(right < givenString.length){
            if(set.add(givenString[right])){
                if(longestSubStringLength < set.size()) longestSubStringLength = set.size();
                right++;
            }
            else{
                set.remove(givenString[left]);
                left++;
            }
        }

        return longestSubStringLength;
    }
    
}
