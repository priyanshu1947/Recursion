import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                
                char c = st.pop();
                
                if (current == ')' && c != '(' || current == '}' && c != '{' || current == ']' && c != '[') {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}
