from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        answer = []
        for i in range(len(nums)):
            if(target - nums[i] in map):
                answer.append(map.get(target-nums[i]))
                answer.append(i)
                return answer
            
            map[nums[i]] = i

        return answer
            
