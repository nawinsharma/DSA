class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> mappedParenthesis = new HashMap<>();
        mappedParenthesis.put(')', '(');
        mappedParenthesis.put('}', '{');
        mappedParenthesis.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!mappedParenthesis.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topElement = stack.pop();
                if (topElement != mappedParenthesis.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}