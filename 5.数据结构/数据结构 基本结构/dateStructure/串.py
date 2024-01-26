class StringData:
    def __init__(self,s):
        self.s = list(s)

    def clearString(self):
        pass

    def StringEmpty(self):
        pass

    def StrLength(self,t):
        return len(t)

    def StrCompare(self, S, T):
        if S == T:
            return 0
        elif S > T:
            return 1
        else:
            return -1

    def Concat(self, s1, s2):
        return s1+s2

## 4
    def SubString(self,sub,s,pos,len):
        if ( int(pos) >= 1 and int(pos) <= self.StrLength(s)) and (int(len) >= 0 and int(len) <= self.StrLength(s)-pos+1):
            for j in range(pos, pos+len):
                sub = sub+s[j]
        return sub


    def Index(self,T,pos):
        sub = ""
        if len(T)==0:
            raise IndexError('T String is empty')
        if pos>0:
            n=self.StrLength(self.s)
            m=self.StrLength(T)
            i = pos
            while(i<=n-m+1):

                if self.StrCompare(self.SubString(sub,self.s,i,m),T) !=0:
                    i +=1
                else:
                    return i
        return 0


    def getString(self):
        print(self.s)

t= "hell world，你好世界"
s= StringData(t)
print(s.Index("好",2))
