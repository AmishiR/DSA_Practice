class Solution(object):
    def search(self, nums, target):
        pivot=nums[0]
        idx=0
        for i in range(1,len(nums)):
            if nums[i-1]>nums[i]:
                pivot=nums[i]
                idx=i
                break
        nums=nums[idx:]+nums[:idx]
        left=0
        right=len(nums)-1
        while left<=right:
            mid=(left+right)//2
            if nums[mid]==target:
                return (mid + idx) % len(nums)

            elif nums[mid]<target:
                left=mid+1
            else:
                right=mid-1
        return -1

        