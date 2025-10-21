from typing import List


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0: return 0
        nums = sorted(nums)
        longest_sequence = 1
        current_sequence = 1
        print(nums)
        for i in range(len(nums)-1):
            if nums[i]+1 == nums[i+1]:
                current_sequence += 1
            elif nums[i] == nums[i+1]:
                print(nums[i], nums[i+1])
            else:
                longest_sequence = max(current_sequence, longest_sequence)
                current_sequence = 1    
        longest_sequence = max(current_sequence, longest_sequence)  
        return longest_sequence        

