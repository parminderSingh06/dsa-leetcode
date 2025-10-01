from typing import List


class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        if len(nums) == 1: return nums

        left = nums[:(len(nums)//2)]
        right = nums[(len(nums)//2):]

        return self.mergeSort(self.sortArray(left), self.sortArray(right))
    

    def mergeSort(self,left: List[int], right: List[int]) -> List[int]:
        result = []
        
        i = 0
        j = 0

        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                result.append(left[i])
                i = i+1
            else:
                result.append(right[j])
                j = j+1

        while i<len(left):
            result.append(left[i])
            i = i+1

        while j<len(right):
            result.append(right[j])
            j = j+1
        
        return result