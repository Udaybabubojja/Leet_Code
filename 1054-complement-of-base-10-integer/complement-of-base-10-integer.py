class Solution:
    def bitwiseComplement(self, n: int) -> int:
        s= bin(n)[2:]
        k=len(s)
        c=0
        for i in s:
            c += (1-int(i))*pow(2,k-1)
            k-=1
        return c