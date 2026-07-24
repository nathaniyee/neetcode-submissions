class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> one = new HashSet<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();

        for (Integer i : nums) {
            one.add(i);
            two.add(i);
        }

        return one.size() != two.size();
    }
}
