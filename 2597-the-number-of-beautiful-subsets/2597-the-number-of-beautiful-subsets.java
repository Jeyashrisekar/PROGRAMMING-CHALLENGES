class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        List<Integer> t = new ArrayList<>();
        return subset(0, t, nums, k)-1;
        
    }
    public int subset(int i, List<Integer> t, int[]a, int k){
        if(i ==  a.length) return 1;

        int pick = 0;
        if(!t.contains(a[i]+k) && !t.contains(a[i]-k)){
            t.add(a[i]);
            pick = subset(i+1, t, a, k);
            t.remove(t.size()-1);
        }

    
        int notpick = subset(i+1, t, a, k);
        return pick + notpick;
    }
}