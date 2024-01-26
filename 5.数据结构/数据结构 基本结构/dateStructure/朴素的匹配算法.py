def matching(s,t):
    len1 = len(s)
    len2 = len(t)
    i = j = k=0
    while( i<len1 and j<len2):
         if(s[i]==t[j]):
             i+=1
             j+=1
         else:
            k+=1
            j=0
            i=k

    if j== len2:
        return k
    else:
        return -1

s = matching("hell world","world")
print(s)