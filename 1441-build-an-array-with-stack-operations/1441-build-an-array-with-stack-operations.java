class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l = new ArrayList<>();
        int c = 1;
        for(int i = 0; i < target.length; i++){

            while(c < target[i]){
                l.add("Push");
                l.add("Pop");
                c++;
            }
            l.add("Push");
            c++;
        }
        return l;
    }
}  