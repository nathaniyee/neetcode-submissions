class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""

        for word in strs:
            res += str(len(word)) + "%" + word

        # 5%hello4%bruh

        return res

    def decode(self, s: str) -> List[str]:
        res = []
        index = 0

        while index < len(s):
            j = index

            while s[j] != "%":
                j += 1

            length = int(s[index:j])

            start = j + 1
            word = s[start: start + length]

            res.append(word)

            index = start + length

        return res


