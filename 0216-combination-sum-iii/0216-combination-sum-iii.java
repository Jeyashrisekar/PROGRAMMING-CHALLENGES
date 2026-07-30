class Solution {
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
       
        combinate(1, 0, k, n, t, l);
        return l;
    }
    public void combinate(int i , int sum, int k, int n, List<Integer> t, List<List<Integer>> l){
      
        if(t.size() == k && sum == n){
            l.add(new ArrayList<>(t));
            return;
        }
        if(t.size() > k || sum > n) return;
        if(i > 9) return;
        
        //pick 
        if(sum < n && i <= 9){
            t.add(i);
            combinate(i+1, sum + i, k, n, t, l);
            t.remove(t.size() - 1);
        }
        combinate(i+1, sum , k, n, t, l);
        
       
        
    }
}