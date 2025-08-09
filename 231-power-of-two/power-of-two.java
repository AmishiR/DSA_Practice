class Solution {
    // 2^0 =1
    // 2^1=10
    // 2^2=100
    // 2^3=1000
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        String binary=Integer.toBinaryString(n);
        int z=binary.length();
        int count=0;
        for(int i=0;i<z;i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
            else{
                continue;
            }
        }
        if (count==1){
            return true;
        }
        else{
            return false;
        }
    }
}
