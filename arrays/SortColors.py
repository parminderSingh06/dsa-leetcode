from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        left = 0
        right = len(nums)-1
        i = 0

        while i <= right:
            if nums[i] == 0:
                self.swap(i,left, nums)
                left = left+1
                i = i + 1
            elif nums[i] == 2:
                self.swap(i,right,nums)
                right = right-1
            else:
                i=i+1

    def swap(self, left: int, right: int, nums: List[int]) -> None:
        nums[left], nums[right] = nums[right], nums[left]



