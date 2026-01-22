import java.util.*;

class Solution {

    public int minimumPairRemoval(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int x : nums) arr.add(x);

        int operations = 0;

        while (!isSorted(arr)) {

            // Map: index -> sum of adjacent pair
            Map<Integer, Integer> pairSum = new HashMap<>();

            for (int i = 0; i < arr.size() - 1; i++) {
                pairSum.put(i, arr.get(i) + arr.get(i + 1));
            }

            // Find leftmost minimum-sum pair
            int minSum = Integer.MAX_VALUE;
            int idx = -1;

            for (Map.Entry<Integer, Integer> entry : pairSum.entrySet()) {
                int i = entry.getKey();
                int sum = entry.getValue();

                if (sum < minSum || (sum == minSum && i < idx)) {
                    minSum = sum;
                    idx = i;
                }
            }

            // Merge the selected pair
            arr.set(idx, arr.get(idx) + arr.get(idx + 1));
            arr.remove(idx + 1);

            operations++;
        }

        return operations;
    }

    private boolean isSorted(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
