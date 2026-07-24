class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dictionary = defaultdict(list)

        for word in strs:
            sort = ''.join(sorted(word))
            dictionary[sort].append(word)

        return list(dictionary.values())

