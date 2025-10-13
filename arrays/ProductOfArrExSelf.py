from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = []
        prefix = []
        postfix = [None] * len(nums)
        
        for i in range(len(nums)):
            if i==0: prefix.append(nums[i]*1)
            else: prefix.append(nums[i]*prefix[i-1])
        print(prefix)
        for i in range(len(nums)-1,-1,-1):
            if i==len(nums)-1: postfix[i] = nums[i]*1
            else: postfix[i] = nums[i] * postfix[i+1]
        print(postfix)
        for i in range(len(nums)):
            if i==len(nums)-1: output.append(prefix[i-1] * 1)
            elif i==0: output.append(postfix[i+1] * 1)
            else: output.append(prefix[i-1] * postfix[i+1])

        return output