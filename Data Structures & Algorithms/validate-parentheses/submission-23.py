class Solution:
    def isValid(self, s: str) -> bool:
        stack = list()
        if len(s) % 2 == 1:
            return False


        for char in range(len(s)):
            if s[char] == '(' or s[char] == '{' or s[char] == '[':
                stack.append(s[char])
            else:
                if s[char] == ')':
                    if not stack or stack.pop() != '(':
                        return False
                if s[char] == '}':
                    if not stack or stack.pop() != '{':
                        return False
                if s[char] == ']':
                    if not stack or stack.pop() != '[':
                        return False
        return not stack