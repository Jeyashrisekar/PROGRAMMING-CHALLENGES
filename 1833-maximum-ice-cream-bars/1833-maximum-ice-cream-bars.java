class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        Arrays.sort(costs);
        int c = 0;
        //int sum = 0;
        for(int i : costs){
            if(i > coins){
                break;

            }
            c++;
            coins-=i;
        }
        return c;
    }
}