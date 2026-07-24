class Solution {
    public boolean isValid(String s) {
        Stack<Character> opens = new Stack<Character>();
        HashMap<Character, Character> closeToOpen = new HashMap<>();

        closeToOpen.put('}', '{');
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');

        for (Character key : s.toCharArray()) {
            if (closeToOpen.containsKey(key)) {
                if (!opens.isEmpty() && opens.peek() == closeToOpen.get(key)) {
                    opens.pop();    
                } else {
                    return false;
                }
            } else {
                opens.push(key);
            }
        }
        return opens.isEmpty();
    }
}
