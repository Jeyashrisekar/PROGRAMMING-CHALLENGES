class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        int prevt = 0;
        for(String i : logs){
            String[] part = i.split(":");
            int x = Integer.parseInt(part[0]);
            String y = part[1];
            int z = Integer.parseInt(part[2]);
            if(y.equals("start")){
                if(!s.isEmpty()){
                    res[s.peek()]+= z - prevt;
                }
                s.push(x);
                prevt = z;

            }
            else{
                res[s.pop()]+= z - prevt + 1;
                prevt = z + 1;
            }
        }
        return res;
    }
}