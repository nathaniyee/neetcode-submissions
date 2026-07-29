class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        res = []

        for word in strs:
            sortedWord = "".join(sorted(word))

            if sortedWord in map:
                map[sortedWord].append(word)
            else:
                map[sortedWord] = [word]

        for key in map.keys():
            res.append(map[key])

        return res