class Solution:
    def mirrorDistance(self, n: int) -> int:

        rev = 0
        temp = n

        # Reverse digits
        while temp > 0:

            digit = temp % 10

            rev = rev * 10 + digit

            temp //= 10

        # Return absolute difference
        return abs(n - rev)