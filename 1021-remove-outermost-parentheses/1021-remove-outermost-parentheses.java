class Solution {
    public String removeOuterParentheses(String s) {
        int dept = 0;
        StringBuilder sb = new StringBuilder();
        for(char i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(dept > 0){
                    sb.append(ch);
                }
                dept++;
            }
            else if(ch == ')'){
                dept--;
                if(dept > 0) sb.append(ch);
                
            }
            

        }
        return sb.toString();
    }
}