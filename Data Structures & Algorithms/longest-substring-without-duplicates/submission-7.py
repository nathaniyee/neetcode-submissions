class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        characters = set()
        res = 0

        left = 0
        for right in range(len(s)):
            while s[right] in characters:
                characters.remove(s[left])
                left += 1
            characters.add(s[right])
            res = max(res, len(characters))

        return res

