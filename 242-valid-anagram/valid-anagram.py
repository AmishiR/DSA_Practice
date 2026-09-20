class Solution(object):
    def isAnagram(self, s, t):
        s=sorted(s)
        t=sorted(t)
        if len(s)!=len(t):
            return False
        for s,t in zip(s,t):
            if s!=t:
                return False
            
        return True
            