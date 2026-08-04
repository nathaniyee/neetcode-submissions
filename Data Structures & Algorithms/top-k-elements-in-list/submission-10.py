class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        # Count each element's frequency using a hash map.
        # Create an array of lists (buckets) where the index represents the frequency count.
        # Place numbers into their matching frequency bucket.
        # Walk backwards from the highest frequency bucket down to 1, collecting elements until you have k numbers.

        dict = {}
        for num in nums:
            if num in dict:
                dict[num] += 1
            else:
                dict[num] = 1

        counts = [[] for _ in range(len(nums) + 1)]

        for num, freq in dict.items():
            counts[freq].append(num)

        res = []
        for i in range(len(counts) - 1, 0, -1):
            for num in counts[i]:
                res.append(num)

                if len(res) == k:
                    return res
        

