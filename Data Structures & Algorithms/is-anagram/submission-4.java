class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            letterCounts.put(s.charAt(i), letterCounts.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!letterCounts.keySet().contains(t.charAt(i))) {
                return false;
            }
            letterCounts.put(t.charAt(i), letterCounts.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Character key : letterCounts.keySet()) {
            if (letterCounts.get(key) != 0) {
                return false;
            }
        }

        return true;
    }
}
