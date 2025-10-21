from typing import List


class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers)-1
        answer = [0,0]

        while right > left:

            currentSum = numbers[left] + numbers[right]

            if currentSum == target:
                answer[0] = left+1
                answer[1] = right+1
                return answer
            elif currentSum > target:
                right -= 1
            else:
                left += 1 

            