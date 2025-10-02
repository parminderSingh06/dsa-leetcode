from typing import List


class Solution:

    def encode(self, strs: List[str]) -> str:
        encodedStr = ""
        
        for word in strs:
            encodedStr += str(len(word)) + "#" + word

        return encodedStr

    def decode(self, s: str) -> List[str]:
        decodeStrArray = []
        i = 0
        while i < len(s):
            j = i

            while s[j] != '#':
                j += 1
            lengthOfWord = int(s[i:j])

            decodeStrArray.append(s[(j+1):(lengthOfWord+j+1)])
            i = j + 1 + lengthOfWord
        
        return decodeStrArray


