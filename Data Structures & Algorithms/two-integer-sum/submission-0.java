class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. Outer loop picks the first number
        for (int i = 0; i < nums.length; i++) {
            // 2. Inner loop starts one step ahead to avoid duplicates
            for (int j = i + 1; j < nums.length; j++) {
                // FIX 1: Changed 'num' to 'nums'
                if ((nums[i] + nums[j]) == target) {
                    // FIX 3: Return immediately once the match is found
                    // FIX 2: Correct Java array return syntax
                    return new int[] {i, j};
                }
            }
        }
        // Fallback return statement to satisfy the compiler
        return new int[] {};
    }
}
