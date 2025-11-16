public class LongestRepeatingCharacter {

    public int characterReplacement(String s, int k) {
        int answer = 0;
        int[] freq = new int[26];
        int left = 0, right = 0;
        int maxFrequency = 0;

        while(right<s.length()){
            char ch = s.charAt(right);


            freq[ch - 'A']++;
            maxFrequency = Math.max(maxFrequency, freq[ch-'A']);

            while(((right-left+1) - maxFrequency) > k){
                char leftCh = s.charAt(left);
                freq[leftCh-'A']--;
                left++;
            }
            answer = Math.max(answer, (right-left+1));
            right++;
        }

        return answer;
    }

}