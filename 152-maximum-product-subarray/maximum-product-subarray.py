class Solution(object):
    def maxProduct(self, nums):
        left=1
        right=1
        ans=nums[0]
        n=len(nums)

        for i in range(n):
            left*=nums[i]
            right*=nums[n-1-i]

            ans=max(ans,left,right)

            if left==0:
                left=1
            if right == 0:
                right = 1
                
        return ans

                