class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        map = {}

        for num in nums:
            if num in map:
                map[num] += 1
            else:
                map[num] = 1

        print(map)

        for num in map.keys():
            if map[num] > len(nums) / 2:
                return num