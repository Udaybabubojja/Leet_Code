class Solution:
    def longestPalindrome(self, s: str) -> str:
        l, n1, n2 = len(s), 0, 1
        
        for i in range(l):
            for a, b in (i, i), (i, i+1):
                while 0 <= a and b < l and s[a] == s[b]: 
                    a, b = a-1, b+1
                if b-a > n2-n1: 
                    n1, n2 = a+1, b
        
        return s[n1:n2]