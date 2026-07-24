class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        newS = sorted(s)
        newT = sorted(t)

        if len(newS) != len(newT):
            return False

        for x in range(len(newS)):
            if newS[x] != newT[x]:
                return False
                
        return True