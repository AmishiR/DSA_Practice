class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0, Subarray = 0;
        for (int num : nums) {
            if (num == 0)
                Subarray++;
            else
                Subarray = 0;
            ans += Subarray;
        }
        return ans;
        
    }
}