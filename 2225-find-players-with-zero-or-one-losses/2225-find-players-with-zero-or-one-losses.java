class Solution {
    public List<List<Integer>> findWinners(int[][] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int winner = arr[i][0];
            int loser = arr[i][1];

            map.putIfAbsent(winner, 0);
            map.put(loser, map.getOrDefault(loser, 0) + 1);
        }
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int player = entry.getKey();
            int loss = entry.getValue();

            if(loss == 0){
                zero.add(player);
            } else if(loss == 1){
                one.add(player);
            }
        }
        Collections.sort(zero);
        Collections.sort(one);
        List<List<Integer>> result = new ArrayList<>();
        result.add(zero);
        result.add(one);
        return result;
    }
}