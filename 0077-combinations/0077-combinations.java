class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        backtrack(l, t, 1, n, k);
        return l;

    }
    public void backtrack(List<List<Integer>> l, List<Integer> t, int i, int n, int k){
        
        //base case
        if(t.size() == k){
            l.add(new ArrayList<>(t));
            return;
        }
        if (i > n)
        return;
       
        
        t.add(i);
        backtrack(l, t, i+1, n, k);
        t.remove(t.size()-1);
        
        backtrack(l, t, i+1, n, k);
        
    }
}