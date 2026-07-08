class Solution {
    public boolean isValid(String s) {
     Stack<Character> st = new Stack<>();
     for(char ch : s.toCharArray()){
        if(ch == '(') st.push(')');
        else if(ch == '{') st.push('}');
        else if(ch == '[') st.push(']');
        else{
            if(st.isEmpty() || )
        }
     }
     return st.isEmpty();
    }
}