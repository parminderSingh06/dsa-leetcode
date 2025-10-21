import re

class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        s = re.sub(r'[^a-zA-Z0-9]', '', s)

        p1 = 0
        p2 = len(s)-1

        while p2 >= p1:
            if s[p1] == s[p2]:
                p2 -= 1
                p1 += 1
                continue
            else:
                return False
        
        return True