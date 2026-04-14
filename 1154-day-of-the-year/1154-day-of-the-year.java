class Solution {
    public int dayOfYear(String date) {
        int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};
        int year = Integer.parseInt(date.substring(0,4));
        int month= Integer.parseInt(date.substring(5,7));
        int day  = Integer.parseInt(date.substring(8,10));
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            a[1] = 29;
        }
        int d = 0;
        for(int i = 0; i < month-1; i++){
            d += a[i];
        }
        d += day;
        return d;

    }
}