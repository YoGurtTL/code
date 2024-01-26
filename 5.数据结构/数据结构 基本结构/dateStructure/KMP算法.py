def get_next(t):
    next = [0] * len(t)
    next [0]= -1
    i = 0
    j = -1
    while(i < len(t)-1):
        if(j==-1 or t[i] == t[j]):
            i = i + 1
            j = j + 1
            next[i]=j
        else:
            j = next[j]
    return next

def index_KMP(t,s,next):
    i=0
    j=0
    while (i<len(s) and j<len(t)):
        if j==-1 or s[i]==t[j]:
            i+=1
            j+=1
        else:
            j=next[j]
    if(j==len(s)):
        return i-j
    else:
        return -1

next = get_next('ababaaaba')
print(index_KMP('aaabbbbababaaaba','ababaaaba',list(next)))


### 123
def get_next_group(one_str):
    '''
    获取到next数组
    '''
    next_group=[0]*len(one_str)
    next_group[0]=-1
    point=-1
    i=0
    length=len(one_str)
    while i<len(one_str)-1:
        if point==-1 or one_str[i]==one_str[point]:
            point+=1
            i+=1
            next_group[i]=point
        else:
            point=next_group[point]
    return next_group


def kmp_match_func(one_str, two_str, next_group):
    '''
    KMP算法
    '''
    i=0
    j=0
    while i<len(one_str) and j<len(two_str):
        if j==-1 or one_str[i]==two_str[j]:
            i+=1
            j+=1
        else:
            j=next_group[j]
    if j==len(two_str):
        return i-j
    else:
        return -1


next = get_next_group('aaba')
print(kmp_match_func('cccdddaaba','aaba',list(next)))