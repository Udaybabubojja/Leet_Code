class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        c=0
        for i in words:
            k=set(i)
            s=0
            for j in k:
                if j not in allowed:
                    s=1
                    break
            if s==0:
                c+=1 
        return c
        