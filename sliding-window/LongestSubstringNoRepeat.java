import java.util.HashSet;

public class LongestSubstringNoRepeat {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int longest= 0;
        int left = 0, right = 0;

        while(right < s.length()){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            longest = Math.max(longest, set.size());
            right++;

        }

        return longest;
    }
    
}
