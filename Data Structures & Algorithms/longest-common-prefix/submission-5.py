class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        first = strs[0]
        res = ""

        for i in range(len(first)):
            for word in strs:
                if i > len(word) - 1 or word[i] != first[i]:
                    return res
            res += first[i]

        return res