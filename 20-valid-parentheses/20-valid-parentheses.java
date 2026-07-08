
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            // Push expected closing bracket
            if (ch == '(') {
                st.push(')');
            } 
            else if (ch == '[') {
                st.push(']');
            } 
            else if (ch == '{') {
                st.push('}');
            } 
            else {
                // If stack empty OR mismatch → invalid
                if (st.isEmpty() || st.pop() != ch) {
                    return false;
                }
            }
        }
        // If stack empty → valid
        return st.isEmpty();
    }
}