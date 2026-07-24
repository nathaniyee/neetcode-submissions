class Solution {
    public boolean isPalindrome(String s) {
        String[] words = s.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().split("\\s+");
        String result = "";
        for (String t : words) {
            result += t;
        }
        String reversed = "";
        for (int i = 0; i < result.length(); i++) {
            reversed += ("" + result.charAt(result.length() - 1 -i));
        }
        return (result.equals(reversed));

    }
}
