import java.util.Arrays;

class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;

        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]);
            }
        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (points[i][0] <= points[j][0] && points[i][1] >= points[j][1]) {
                    boolean isPairValid = true;

                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;

                        int xA = points[i][0], yA = points[i][1];
                        int xB = points[j][0], yB = points[j][1];
                        int xK = points[k][0], yK = points[k][1];

                        if (xK >= xA && xK <= xB && yK >= yB && yK <= yA) {
                            isPairValid = false;
                            break;
                        }
                    }

                    if (isPairValid) count++;
                }
            }
        }
        return count;
    }
}
