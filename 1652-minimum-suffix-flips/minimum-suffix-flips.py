class Solution(object):
    def minFlips(self, target):
        count=0
        prev='0'
        for c in target:
            if c!=prev:
                count+=1
                prev=c
        return count
        