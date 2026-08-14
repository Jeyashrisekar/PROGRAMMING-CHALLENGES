class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int t = 0;
        for(char i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(')  st.push(ch);
            else if((!st.isEmpty()) && ch == ')') st.pop();
            else if(ch == ')' && (st.isEmpty())) t++;
        }
        return st.size()+t;
    }
}