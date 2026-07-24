class Solution {
    public int characterReplacement(String s, int k) {
        int[] letters = new int[26];
        int result = 0;
        int common = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            letters[s.charAt(r) - 'A']++;
            common = Math.max(common, letters[s.charAt(r) - 'A']);

            if (r - l + 1 - common > k) {
                letters[s.charAt(l) - 'A']--;
                l++;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
