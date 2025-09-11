package arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        int smallestIndex = 0;
        int smallStr = strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("")) return "";
            if(strs[i].length() < smallStr){ 
                smallStr = strs[i].length(); 
                smallestIndex = i;
            }
        }

        String prefix = strs[smallestIndex];
        smallestIndex = prefix.length();
        int i=0;
        while(true){
            if(i >= strs.length) break;
            String temp = strs[i].substring(0, smallestIndex);
            if(prefix.equals(temp)) i++;
            else{ 
                if(smallestIndex <= 0) break;
                prefix = prefix.substring(0, --smallestIndex);
            }
        }
        return prefix;
    }
}
