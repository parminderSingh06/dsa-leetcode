import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        int[] temp = new int[26];

        if(s1.length() > s2.length()) return false;
        
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i) - 'a']++;
        }
        for(int i=0;i<s1.length();i++){
            temp[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(arr, temp)) return true;

        int left = 0, right = s1.length();

        while(right < s2.length()){
            char lftChr = s2.charAt(left);
            char rgtChr = s2.charAt(right);

            temp[rgtChr - 'a']++;
            temp[lftChr - 'a']--;

            if(Arrays.equals(arr, temp)) return true;
            
            right++;
            left++;
        }
        return false;
    }
}
