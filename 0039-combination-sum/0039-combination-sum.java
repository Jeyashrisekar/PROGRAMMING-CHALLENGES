//unbound knapsack - picking a element unlimited times
class Solution {
    public List<List<Integer>> combinationSum(int[] a, int target) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        comsum(0, 0, target, t, r, a);
        return r;
    }
    public void comsum(int i, int cur, int target, List<Integer> t, List<List<Integer>> r, int[]a){

        if(cur == target){
            r.add(new ArrayList<>(t));
            return;

        }
        if(i == a.length || cur > target) return;
        //pick
        t.add(a[i]);
        comsum(i, cur+a[i], target, t, r, a);
        //backtrack
        t.remove(t.size()-1);

        //not pick
        comsum(i+1, cur, target, t, r, a);
    }
}