import java.util.*;

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int max = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = digitSum(i);

            m.put(sum, m.getOrDefault(sum, 0) + 1);

            max = Math.max(max, m.get(sum));
        }

        return max;
    }
    int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}