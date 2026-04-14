class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
        if (month < 3) {
            month += 12;
            year--;
        }

        int q = day;
        int m = month;
        int K = year % 100;
        int J = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        return days[h];
    }
}