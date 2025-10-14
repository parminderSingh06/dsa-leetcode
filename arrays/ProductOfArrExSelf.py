from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        output = []   
        prefix = 1

        for i in range(len(nums)):
            output.append(prefix)
            prefix = nums[i] * prefix


        postfix = 1

        for i in range(len(nums)-1,-1,-1):
            output[i] = postfix * output[i]
            postfix = nums[i] * postfix

        return output