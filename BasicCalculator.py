class Solution:
    def calculate(self, s: str) -> int:
        cur, res, sign, stack = 0, 0, 1, []
        for c in s:
            if c.isdigit():
                cur = cur * 10 + int(c)
            elif c in "+-":
                res += (cur * sign)
                cur = 0
                if c == '+':
                    sign = 1
                else:
                    sign = -1
            elif c is '(':
                stack.append(res)
                stack.append(sign)
                res = 0
                sign = 1
            elif c is ')':
                res += (cur * sign)
                res *= stack.pop()
                res += stack.pop()
                cur = 0
        return res + (cur * sign)