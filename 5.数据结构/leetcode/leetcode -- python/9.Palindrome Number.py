class Solution:
    def isPalindrome(self, x: int) -> bool:
        if(x<0):
            return False
        else:
            x = str(x)
            length=len(x)
            for i in range (0,length//2):
                if(x[i]!=x[-(i+1)]):
                   return False
            return True



a= Solution()
print(a.isPalindrome(11211))
