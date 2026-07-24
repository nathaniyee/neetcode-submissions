class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dupes = new HashSet<Integer>();
        for (Integer i : nums) {
            dupes.add(i);
        }
        return dupes.size() != nums.length;
    }
}
