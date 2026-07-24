class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }
}
