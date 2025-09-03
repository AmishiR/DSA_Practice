import java.util.Arrays;

class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]);
            }
        });

        int count = 0;

        for (int i = 0; i < n; i++) {
            int y_A = points[i][1];
            int maxY = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                int y_B = points[j][1];

                if (y_B <= y_A) {
                    if (y_B > maxY) {
                        count++;
                        maxY = y_B;
                    }
                }
            }
        }
        return count;
    }
}
