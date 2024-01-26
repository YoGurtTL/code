class Solution:
    def romanToInt(self, s: str) -> int:
        d = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500,
             'M': 1000,'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
        sum = 0
        falge = False
        for index, i in enumerate(s):
            if index!=len(s)-1:
                if s[index] == 'I' and (s[index+1] == 'V' or s[index+1] == 'X') :
                    str = s[index]+s[index+1]
                    sum += d[str]
                    falge = True
                    continue
                elif s[index] == 'X' and (s[index+1] == 'L' or s[index+1] == 'C') :
                    str = s[index] + s[index + 1]
                    sum += d[str]
                    falge = True
                    continue
                elif s[index] == 'C' and (s[index + 1] == 'D' or s[index + 1] == 'M'):
                    str = s[index] + s[index + 1]
                    sum += d[str]
                    falge = True
                    continue
            if falge == False:
                sum += d[i]
            falge=False
        return sum

s = Solution()
print(s.romanToInt('MCMXCVI'))