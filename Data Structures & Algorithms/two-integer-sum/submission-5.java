class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] sortedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            sortedNums[i][0] = nums[i];
            sortedNums[i][1] = i;
        }
        Arrays.sort(sortedNums, (a, b) -> Integer.compare(a[0], b[0]));
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int currentSum = sortedNums[left][0] + sortedNums[right][0];
            if (currentSum == target) {
                int idx1 = sortedNums[left][1];
                int idx2 = sortedNums[right][1];
                return new int[] {Math.min(idx1, idx2), Math.max(idx1, idx2)};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}