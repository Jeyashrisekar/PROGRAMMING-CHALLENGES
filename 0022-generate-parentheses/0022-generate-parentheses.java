class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        generate(l, s, 0, 0,  n);
        return l;

    }
    public void generate(List<String> l, StringBuilder s, int o, int c, int n){
        if(s.length() == 2*n){
            l.add(s.toString());
            return;
        }
        if(o < n){
            s.append("(");
            generate(l, s,o+1, c, n);
            s.deleteCharAt(s.length()-1);
        }
        if(c < o) {
            s.append(')');
            generate(l, s, o, c+1, n);
            s.deleteCharAt(s.length()-1);
        }

    }
}