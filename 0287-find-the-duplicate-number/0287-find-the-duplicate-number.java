class Solution {
    public int findDuplicate(int[] nums) {
        HashSet <Integer> s = new HashSet<>();
        for(int x : nums){
            if(!s.contains(x)){
                s.add(x);
            }
            else return x;
        }
        return -1;

    }
}