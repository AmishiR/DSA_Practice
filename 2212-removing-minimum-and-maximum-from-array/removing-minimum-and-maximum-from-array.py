class Solution(object):
    def minimumDeletions(self, nums):
       maxi=max(nums)
       mini=min(nums)

       value1=nums.index(maxi)
       value2=nums.index(mini)

       left=min(value1,value2)
       right=max(value1,value2)

       front=right+1
       back = len(nums) - left
       both =(left+1) +(len(nums) - right)

       return min(front,back,both)
