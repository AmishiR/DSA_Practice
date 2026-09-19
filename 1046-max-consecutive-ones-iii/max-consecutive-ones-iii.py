class Solution(object):
    def longestOnes(self, nums, k):
        left=0
        zeros=0
        max_count=0
        n=len(nums)

        for right in range(len(nums)):
            if nums[right]==0:
                zeros+=1

            while zeros>k:
                if nums[left]==0:
                    zeros-=1

                left+=1
            max_count=max(max_count,right-left+1)

        return max_count
        