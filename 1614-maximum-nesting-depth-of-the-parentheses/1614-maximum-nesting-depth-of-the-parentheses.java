class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int dept = 0;
        Stack<Character> st = new Stack<>();
        for(char i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                dept++;
                max = Math.max(dept, max);
            }
            else if(ch == ')'){
                st.pop();
                dept--;
            }

        }
        return max;
    }
}