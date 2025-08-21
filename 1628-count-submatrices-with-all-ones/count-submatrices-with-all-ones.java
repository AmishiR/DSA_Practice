class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] height = new int[n][m];
        int sum = 0;

        // build histogram heights
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    height[i][j] = 0;
                } else {
                    height[i][j] = (i == 0 ? 1 : height[i-1][j] + 1);
                }

               
                int minHeight = height[i][j];
                for (int k = j; k >= 0 && minHeight > 0; k--) {
                    minHeight = Math.min(minHeight, height[i][k]);
                    sum += minHeight;
                }
            }
        }

        return sum;
    }
}
