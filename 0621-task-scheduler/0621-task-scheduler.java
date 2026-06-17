class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for(char task : tasks){
            int freq = map.getOrDefault(task, 0) + 1;
            map.put(task, freq);

            maxFreq = Math.max(maxFreq, freq);
        }
        int countMax = 0;
        for(int freq : map.values()){
            if(freq == maxFreq){
                countMax++;
            }
        }

        int slots = (maxFreq - 1) * (n + 1) + countMax;
        return Math.max(tasks.length, slots);
    }
}