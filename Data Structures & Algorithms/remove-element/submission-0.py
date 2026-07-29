class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0
        different = []
        
        for num in nums:
            if num != val:
                k += 1
                different.append(num)

        for i in range(k):
            nums[i] = different[i]

        return k

        