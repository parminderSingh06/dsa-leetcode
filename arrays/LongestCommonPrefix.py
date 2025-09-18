from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        shortest_index = 0
        shortest_length = len(strs[0])
        for i in range(1,len(strs)):
            if len(strs[i]) < shortest_length:
                shortest_length = len(strs[i])
                shortest_index = i

        prefix = strs[shortest_index]
        smallest_index = len(prefix)
        i = 0
        while True:
            if i >= len(strs): break

            temp = strs[i][0:smallest_index]
            if temp == prefix: i += 1
            else:
                if smallest_index <= 0: break
                prefix = prefix[0:smallest_index-1]
                smallest_index-=1
            
        return prefix