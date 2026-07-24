class Solution(object):
    def uniqueXorTriplets(self, nums):
        n = len(nums)
        mp = {}
        
        for i in range(n):
            for j in range(i, n):
                mp[nums[i] ^ nums[j]] = j
                
        st = set()
        
        for k, idx in mp.items():
            for j in range(idx, n):
                st.add(k ^ nums[j])
                
        return len(st)
        