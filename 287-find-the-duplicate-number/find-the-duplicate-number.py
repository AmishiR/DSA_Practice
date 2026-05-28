class Solution(object):
    def findDuplicate(self, nums):
        seen=set()
        ans=0
        for num in nums:
            if num not in seen:
                seen.add(num)
            else:
                ans=num
        return ans
            
        