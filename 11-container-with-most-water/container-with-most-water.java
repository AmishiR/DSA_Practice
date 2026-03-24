class Solution {
    public int maxArea(int[] height) {
        int first=0; //one pointer in start
        int last =height.length-1; //one pointer at last

        int maxarea=0; //to store area max which would be the solution
        int value=0; //to calculate area

        //it would calculate till first pointer is equal to last pointer
        while(first<last){
            value=Math.min(height[first],height[last])*(last-first);
            if(maxarea<value){
                maxarea=value;
            }
            if (height[first] < height[last]) {
                first++;
            } else {
                last--;
            }
        }
        return maxarea;
    }
}