class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<String> stack = new Stack<String>();
        String openings = "({[";
        String closings = ")}]";
        String[] chars = s.split("");
        for (String t : chars) {
            if (openings.contains(t)) {
                stack.push(t);
            }

            if (closings.contains(t)) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (t.equals(")") && !stack.peek().equals("(")) {
                    return false;
                }
                if (t.equals("}") && !stack.peek().equals("{")) {
                    return false;
                }
                if (t.equals("]") && !stack.peek().equals("[")) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
