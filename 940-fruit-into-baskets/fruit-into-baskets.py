class Solution(object):
    def totalFruit(self, fruits):

        left = 0
        count = {}
        max_count = 0

        for right in range(len(fruits)):

            # Add fruit
            count[fruits[right]] = count.get(fruits[right], 0) + 1

            # More than 2 types
            while len(count) > 2:

                count[fruits[left]] -= 1

                # This fruit is completely removed
                if count[fruits[left]] == 0:
                    del count[fruits[left]]

                left += 1

            # Valid window
            max_count = max(max_count, right - left + 1)

        return max_count