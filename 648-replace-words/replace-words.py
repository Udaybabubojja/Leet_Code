class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        k=sentence.split()
        for i in range(len(k)):
            l=k[i]
            for j in (dictionary):
                if len(j)<len(l) and l.startswith(j):
                    l=j
            k[i]=l
        m=" ".join(k)
        return m
        