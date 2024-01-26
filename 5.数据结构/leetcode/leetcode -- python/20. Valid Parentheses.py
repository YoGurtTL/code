class Solution(object):
    def isValid(self, s):
        stack = []
        dic = {"(" : ")", "{" : "}", "[" : "]"}
        flag = False
        for i in s:
            if i in dic:
               stack.append(i)
               print(stack)
            elif not stack or dic[stack.pop()]!= i:
                return False
        return len(stack) == 0


s1 = Solution()
s1.isValid("{[]}")