class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int l = 0;
        int h = n;
        int[] a = new int[n+1];
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'I'){
                a[i] = l;
                l++;

            }
            else{
                a[i] = h;
                h--;
            }
        }
        a[n] = l;
        return a;
    }
}