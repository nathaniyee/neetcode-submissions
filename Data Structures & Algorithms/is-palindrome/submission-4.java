class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder stb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stb.append(Character.toLowerCase(c));
            }
        }
        return stb.toString().equals(stb.reverse().toString());
    }
}
