class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char i : tasks){
            freq[i-'A']++;
        }
        Arrays.sort(freq);
        int countmax = 0;
        int maxfreq = freq[25];
        for(int i = 25 ; i >= 0 && maxfreq == freq[i] ; i--){
            countmax++;
        }
        int m = (maxfreq - 1) * (n + 1) + countmax;
        int length = tasks.length;
        if(length < m) return m;
        else return length;
    }
}