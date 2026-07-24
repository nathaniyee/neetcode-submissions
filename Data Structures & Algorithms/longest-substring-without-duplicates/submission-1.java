class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        String[] word = s.split("");
        HashSet<String> set = new HashSet<String>();
        int l = 0;
        int lengthOfSubstring = 0;

        for (int r = 0; r < word.length; r++) {
            while (set.contains(word[r])) {
                set.remove(word[l]);
                l++;
            }
            set.add(word[r]);
            lengthOfSubstring = Math.max(lengthOfSubstring, r - l + 1);
        }
        return lengthOfSubstring;
    }
}
