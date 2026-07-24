class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for char in tokens:
            if char != "+" and char != '-' and char != '*' and char != '/':
                stack.append(int(char))
            else:
                second = stack.pop()
                first = stack.pop()
                if char == '+':
                    stack.append(first + second)
                elif char == '-':
                    stack.append(first - second)
                elif char == '*':
                    stack.append(first * second)
                else: 
                    stack.append(math.trunc(first / second))

        return stack.pop()
