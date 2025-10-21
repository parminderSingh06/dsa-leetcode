from typing import List


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0: return 0

        hset = set(nums)
        longest = 1

        for num in hset:
            if num-1 not in hset:
                curr_seq = 1
                next_num = num + 1
                while next_num in hset:
                    curr_seq += 1
                    next_num += 1
                longest = max(curr_seq, longest)
        return longest