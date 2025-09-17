from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # nums.sort()

        # for i in range(len(nums)-1):
        #     if nums[i] == nums[i+1]:
        #         return True
        seen = set(nums)
        if len(seen) != len(nums): return True
        return False