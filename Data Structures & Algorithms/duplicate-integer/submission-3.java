class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> theSet = new HashSet<Integer>();
        ArrayList<Integer> theList = new ArrayList<Integer>();

        for (int i : nums) {
            theSet.add(i);
            theList.add(i);
        }

        return theSet.size() != theList.size();
    }
}
