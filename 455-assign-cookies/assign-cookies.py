class Solution(object):
    def findContentChildren(self, g, s):
        g.sort()
        s.sort()
        count=0
        left=0
        right=0
        while left<len(g) and right<len(s):
            if g[left]<=s[right]:
                count+=1
                left+=1
            right+=1

        return count
                    
        