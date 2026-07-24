class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        int result = 0;

        for (int i : nums) {
            numbers.add(i);
        }

        for (int i : numbers) {
            if (!numbers.contains(i - 1)) {
                int currentLength = 0;
                while (numbers.contains(i + currentLength)) {
                    currentLength++;
                }
                result = Math.max(result, currentLength);
            }
        }

        return result;


    }
}
