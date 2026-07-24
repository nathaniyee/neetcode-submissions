class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> theMap = new HashMap<>();

        for (String word : strs) {
            int[] count = new int[26];

            for (int i = 0; i < word.length(); i++) {
                count[word.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(count);

            if (!theMap.containsKey(key)) {
                theMap.put(key, new ArrayList<>());
            }
            theMap.get(key).add(word);
        }
        return new ArrayList<>(theMap.values());
    }
}
