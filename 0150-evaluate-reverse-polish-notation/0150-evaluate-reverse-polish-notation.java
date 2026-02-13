class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String i : tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                int b = s.pop();
                int a = s.pop();
                int res = 0;
                if(i.equals("+")) res = b + a;
                else if(i.equals("-")) res = a - b;
                else if(i.equals("*")) res = b * a;
                else if(i.equals("/")) res = a / b;
                s.push(res);

            }
            else{
                s.push(Integer.parseInt(i));

            }
        }
        return s.pop();
    }
}