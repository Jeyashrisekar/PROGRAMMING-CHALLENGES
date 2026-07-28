class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        set(0, nums, t, l);
        return l;

    }
    public void set(int i , int[] a, List<Integer> t,  List<List<Integer>> l){
        if(i == a.length){
            l.add(new ArrayList<>(t));
            return;
        } 

        t.add(a[i]);//pick
        set(i +1, a, t, l);
        t.remove(t.size()-1); //backtracking

        //not pick
        set(i+1, a, t, l);

    }
     
}