class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = defaultdict(int)

        for number in nums:
            counts[number] = counts[number] + 1

        result = dict(sorted(counts.items(), key=lambda item: item[1], reverse=True))

        print(result)
        retard = []
        for key in result.keys():
            if k == 0:
                return retard
            retard.append(key)
            k = k - 1

        if k == 0:
            return retard

        return [0, 0]
            