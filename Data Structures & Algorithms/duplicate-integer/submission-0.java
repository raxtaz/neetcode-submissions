class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dupli = new HashSet<>();

        for (int n : nums) {
            // 1. Check if the set contains the CURRENT NUMBER 'n' (not the whole array 'nums')
            if (dupli.contains(n)) {
                return true; 
            }
            // 2. If it's not a duplicate, add it to the set so we can check against it later
            dupli.add(n);
        }
        return false;
    }
}