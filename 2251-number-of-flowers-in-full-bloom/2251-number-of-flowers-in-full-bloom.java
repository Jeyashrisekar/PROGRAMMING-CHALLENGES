//brute force - take people and see if they were in the range (start and end) if it is in range then increment the count and store in the array. 

//optimised : binary search
//sorting start time and ending time
//cann see = in starting time first index whose value > people[i] that he can see
//cant see = ending time fisrt index whose value is >= target to find no of flowers he cant see
//ans = can see - cant see

class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = people.length;
        int[] a = new int[n];
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        for(int i = 0; i < flowers.length; i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        for(int i = 0; i < n; i++){
            int x = greaterthanstart(people[i], start);
            int y = lessthanend(people[i], end);
            a[i] = x - y;
        } 
        return a;
    }
     public int greaterthanstart(int personTime, int[] start){ 
        int l = 0; 
        int h = start.length - 1; 
        int ans = 0; 
        
        while (l <= h) { 
            int mid = (l + h) / 2; 
            if (start[mid] <= personTime) { 
                ans = mid + 1; 
                l = mid + 1; 
            } else { 
                h = mid - 1; 
            } 
        } 
        return ans; 
    }
    public int lessthanend(int personTime, int[] end){ 
        int l = 0; 
        int h = end.length - 1; 
        int ans = 0; 
        
        while (l <= h) { 
            int mid = (l + h) / 2; 
            if (end[mid] < personTime) { 
                ans = mid + 1; 
                l = mid + 1; 
            } else { 
                h = mid - 1; 
            } 
        } 
        return ans; 
    } 

    
    // public int cansee(int a, int[][] flower){
    //     int count = 0;
    //     for(int i = 0; i < flower.length; i++){
    //         if(a >= flower[i][0] && a <= flower[i][1]) count++;
    //     }
    //     return count;
    // }
}