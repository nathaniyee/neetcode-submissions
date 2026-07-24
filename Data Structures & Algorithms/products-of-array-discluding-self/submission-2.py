class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)
        
        prefix = 1
        for x in range(len(nums)):
            result[x] = prefix
            prefix *= nums[x]

        postfix = 1
        for x in range(len(nums) - 1, -1, -1):
            result[x] *= postfix
            postfix *= nums[x]

        return result
        