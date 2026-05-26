class Solution(object):
    def reverseVowels(self, s):
        vowels={'a','e','i','o','u','A','E','I','O','U'}
        s=list(s)

        contains=[]
        first=0
        last=len(s)-1

        while first<last:
            while first<last and s[first] not in vowels:
                first+=1
            
            while first<last and s[last] not in vowels:
                last-=1

            s[first],s[last]=s[last],s[first]
            first+=1
            last-=1

            
        return "".join(s)
        
           


        