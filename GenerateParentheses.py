class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
    
        res = []

        def backtrack(openN, closeN, str):
            if openN == closeN == n:
                res.append(str)
                return

            if openN < n:
                backtrack(openN + 1, closeN, str + "(")
            if closeN < openN:
                backtrack(openN, closeN + 1, str + ")")

        backtrack(0, 0, "")
        return res
        