package arrays.lc;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String answer = strs[0];

        for(int i=1; i<strs.length;i++){
            for(int j=0; j<answer.length();j++){
                if(j >= strs[i].length()){
                    answer = answer.substring(0, j);
                    break;  
                };
                if(answer.charAt(j) == strs[i].charAt(j)){
                    continue;
                }
                else{
                    answer = answer.substring(0, j);
                    break;
                }
            }
        }

        return answer;
    }     
}
