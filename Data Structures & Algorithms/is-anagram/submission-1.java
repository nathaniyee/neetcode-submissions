class Solution {
    public boolean isAnagram(String s, String t) {
        char[] one = s.toCharArray();
        char[] two = t.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        String resultOne = new String(one);
        String resultTwo = new String(two);

        return resultOne.equals(resultTwo);

    }
}
