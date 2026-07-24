class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        x = set()
        for y in range (len(nums)):
            x.add(nums[y])

        return len(x) != len(nums)