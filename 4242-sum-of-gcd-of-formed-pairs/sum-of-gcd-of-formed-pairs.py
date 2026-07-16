from fractions import gcd

class Solution(object):
    def gcdSum(self, nums):
        maxi = 0
        n = len(nums)

        for i in range(n):
            maxi = max(maxi, nums[i])
            nums[i] = gcd(nums[i], maxi)

        nums.sort()

        total = 0
        for i in range(n // 2):
            total += gcd(nums[i], nums[n - i - 1])

        return total