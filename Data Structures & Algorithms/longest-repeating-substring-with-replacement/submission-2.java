class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> counts = new HashMap<>();
        int result = 0;

        int left = 0;
        int maxFrequency = 0;

        for (int right = 0; right < s.length(); right++) {
            counts.put(s.charAt(right), counts.getOrDefault(s.charAt(right), 0) + 1);
            maxFrequency = Math.max(maxFrequency, counts.get(s.charAt(right)));

            while ((right - left + 1) - maxFrequency > k) {
                counts.put(s.charAt(left), counts.get(s.charAt(left)) - 1);
                left++;
            }
            result = Math.max(result, right - left + 1);

        }

        return result;
    }
}
