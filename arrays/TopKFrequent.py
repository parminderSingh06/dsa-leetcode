from typing import List
import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}

        for i in range(len(nums)):
            map[nums[i]] = map.get(nums[i], 0) + 1
        
        heap = []

        for num, count in map.items():
            heapq.heappush(heap, (count,num))
            if(len(heap) > k):
                heapq.heappop(heap)

        ans = []
        for count, num in heap:
            ans.append(num)

        return ans
        

