class Solution:
    def longestCommonPrefix(self, strs):
        commonPrefix = ''
        for chars in zip(*strs):
            if len(set(chars))==1:
                commonPrefix += chars[0]
            else:
                break
        return commonPrefix

strs = ["flower","flow","flight"]
s = Solution()
res = s.longestCommonPrefix(strs)
print(res)