class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int sum=0; //to calculate sum 
        List<List<Integer>> result = new ArrayList<>(); // to store result
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){ // choose one by one
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int first=i+1; //one pointer to increase sum
            int last=nums.length-1; //second pointer to decrease sum
            while(first<last){
                sum=nums[i]+nums[first]+nums[last];
                if(sum<0){
                first++;
            }
            else if(sum>0){
                last--;
            }
            else{
                result.add(Arrays.asList(nums[i], nums[first], nums[last]));
                while (first < last && nums[first] == nums[first + 1]) first++;
                while (first < last && nums[last] == nums[last - 1]) last--;
                first++;
                last--;
                }
            }
            
        }
        return result;
    }
}