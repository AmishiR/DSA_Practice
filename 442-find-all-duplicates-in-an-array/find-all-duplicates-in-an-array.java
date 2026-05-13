class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output=new ArrayList<>();
        HashMap<Integer,Integer>count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
            }
            else{
                output.add(nums[i]);
            }
        }
        return output;
    }
}