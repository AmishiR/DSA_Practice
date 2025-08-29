class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n =mat.length; //rows
        int m = mat[0].length; //columns

        /*
        dir=0 then left to right
        dir=1 then top to bottom
        dir=2 then right to left
        dir=3 then bottom to top
        */

        int top=0; // top row
        int bottom=n-1; //bottom row
        int left=0; //left most columns
        int right=m-1; //right most column

        ArrayList<Integer>res=new ArrayList<>();
        int dir=0; // initialise with dir=0
        while(top<=bottom && left<=right){
            if(dir==0){
            for(int i=left;i<=right;i++){
                res.add(mat[top][i]);
            }
            top++;
        }
        else if(dir==1){
            for(int i=top;i<=bottom;i++){
                res.add(mat[i][right]);
            }
            right--;
        }
        else if(dir==2){
            for(int i =right;i>=left;i--){
                res.add(mat[bottom][i]);
            }
            bottom--;
        }
        else if(dir==3){
            for(int i=bottom;i>=top;i--){
                res.add(mat[i][left]);
            }
            left++;
        }
        
        dir++;
        if(dir==4){
        dir=0;
        }
        }
        return res;   
    }
}