from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        length = len(nums)
        p = 0

        while p < length:
            if nums[p] == val:
                nums[p] = nums[length-1]
                length = length-1
            else:
                p = p+1
        
        return length        