class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberCounts = new HashMap<>(); //Key: Number, Value: Index

        for (int i = 0; i < nums.length; i++) {
            numberCounts.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (numberCounts.containsKey(diff) && i != numberCounts.get(diff)) {
                return new int[]{i, numberCounts.get(diff)};
            }
        }
        return new int[]{};
    }
}
