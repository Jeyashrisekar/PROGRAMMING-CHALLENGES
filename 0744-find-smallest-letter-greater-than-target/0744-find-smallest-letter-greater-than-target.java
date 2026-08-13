class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int h = letters.length - 1;
        int ans= -1; //int ans = Integer.MAX_VALUE;

        while(l <= h){
            int mid = (l + h)/2;
            if(letters[mid] > target){
                ans = mid; //ans = Math.min(ans, mid)
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }

        }
        return (ans ==-1)?letters[0]:letters[ans]; // return ans!= Integer.MAX_VALUE ? letters[ans] : letter[0];
        
    }
    
}

