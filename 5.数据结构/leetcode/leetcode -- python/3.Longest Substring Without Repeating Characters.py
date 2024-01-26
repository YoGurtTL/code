def LengthOfLongestSubstring(s):
    char_ser = set()
    max_len,start=0,0
    for i,c in enumerate(s):
        while c in char_ser:
            char_ser.remove(s[start])
            start += 1
        char_ser.add(c)
        max_len = max(max_len, i-start+1)
    return max_len
s = LengthOfLongestSubstring("abcabcbb")
print(s)