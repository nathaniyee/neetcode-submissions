class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = defaultdict(int)

        for number in nums:
            counts[number] = counts[number] + 1

        sort = dict(sorted(counts.items(), key=lambda item: item[1], reverse=True))

        result = []
        for key in sort.keys():
            if k == 0:
                return result
            result.append(key)
            k = k - 1

        if k == 0:
            return result

        return [0, 0]
            