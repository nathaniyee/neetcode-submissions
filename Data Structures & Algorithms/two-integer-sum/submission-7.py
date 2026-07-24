class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indices = {} # value -> index

        for index, value in enumerate(nums):
            indices[value] = index

        for index, value in enumerate(nums):
            diff = target - value
            if diff in indices and indices[diff] != index:
                return [index, indices[diff]]

        return [0, 0]