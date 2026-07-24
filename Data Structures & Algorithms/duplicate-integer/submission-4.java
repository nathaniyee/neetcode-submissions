class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> theSet = new HashSet<Integer>();

        for (int i : nums) {
            theSet.add(i);
        }

        return nums.length != theSet.size();
    }
}
