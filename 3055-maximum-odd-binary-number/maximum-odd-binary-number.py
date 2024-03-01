class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        k = s.count('1')
        if k>0:
            return '1'*(k-1)+ '0'*(len(s)-k)+'1'
        return '0'*len(s)