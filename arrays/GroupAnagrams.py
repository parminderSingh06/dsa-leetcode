from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        for i in range(len(strs)):
            temp_char_list = sorted(strs[i])
            temp_string = "".join(temp_char_list)
            if temp_string in map:
                map[temp_string].append(strs[i])
            else:
                map[temp_string] = [strs[i]]
        
        return list(map.values())
        
     