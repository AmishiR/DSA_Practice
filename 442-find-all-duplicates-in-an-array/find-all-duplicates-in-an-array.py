class Solution(object):
    def findDuplicates(self, nums):
        output=[]
        count={}
        for num in nums:
            if num not in count:
                count[num]=1
            else:
                output.append(num)
        return output
        