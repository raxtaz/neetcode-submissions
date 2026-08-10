class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. Create a 2D array tracking [value, original_index]
        int[][] sortedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i][0] = nums[i]; // The value
            sortedNums[i][1] = i; // The original index
        }

        // 2. Sort the 2D array based on the values (column 0)
        Arrays.sort(sortedNums, (a, b) -> Integer.compare(a[0], b[0]));

        // 3. Initialize Two Pointers
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = sortedNums[left][0] + sortedNums[right][0];

            if (currentSum == target) {
                // Reconstruct the indices ensuring the smaller index comes first
                int idx1 = sortedNums[left][1];
                int idx2 = sortedNums[right][1];
                return new int[] {Math.min(idx1, idx2), Math.max(idx1, idx2)};
            } else if (currentSum < target) {
                left++; // Sum is too small, move left pointer to a larger value
            } else {
                right--; // Sum is too big, move right pointer to a smaller value
            }
        }

        return new int[] {}; // Fallback
    }
}
