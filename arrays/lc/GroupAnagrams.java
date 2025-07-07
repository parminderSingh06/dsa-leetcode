package arrays.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String currentWord = strs[i];
            char[] currentWordArray = currentWord.toCharArray();
            Arrays.sort(currentWordArray);
            String sortedWord = new String(currentWordArray);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(currentWord);
            
        }

        List<List<String>> answer = new ArrayList<>(map.values());
        return answer;
    } 
}