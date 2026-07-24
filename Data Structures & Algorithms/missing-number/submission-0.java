class Solution {
    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = nums.length; i > 0; i--) {
            result += i;
        }
        for (Integer i : nums) {
            result -= i;
        }
        return result;
    }
}
