class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> counts = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            if (!counts.containsKey(key)) {
                counts.put(key, new ArrayList<>());
            }
            counts.get(key).add(s);
        }

        return new ArrayList<>(counts.values());
    }
}
