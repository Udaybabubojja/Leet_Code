class Solution:
    def findMedianSortedArrays(self, a: List[int], k: List[int]) -> float:
        l=[]
        l=a+k 
        l.sort()
        m=len(l)//2
        if len(l)%2 == 0 :
            return float((l[m]+l[m-1])/2)
        return float(l[m])
        