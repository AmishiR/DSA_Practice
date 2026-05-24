class Solution(object):
    def searchRange(self, nums, target):

        first = -1
        last = -1

        for i in range(len(nums)):
            if nums[i] == target:
                first = i
                break

        for i in range(len(nums) - 1, -1, -1):
            if nums[i] == target:
                last = i
                break

        return [first, last]