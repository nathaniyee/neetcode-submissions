class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numbers = set(nums)
        result = 0
        
        for num in numbers:
            if (num - 1) not in numbers:
                current = 0
                while (num + current) in numbers:
                    current += 1
                if current > result:
                    result = current

        return result


