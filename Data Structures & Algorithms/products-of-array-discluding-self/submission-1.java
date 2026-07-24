class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int prefix = 1;
        int index = 0;

        while (index != nums.length) {
            result[index] = prefix;
            prefix *= nums[index++];
        }

        index--;
        int postfix = 1;
        while (index >= 0) {
            result[index] *= postfix;
            postfix *= nums[index--];
        }

        return result;
    }
}  
