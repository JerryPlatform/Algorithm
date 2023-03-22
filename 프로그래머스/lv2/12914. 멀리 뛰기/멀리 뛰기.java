import java.util.*;

class Solution {
    public int solution(int n) {
        long answer = 0;

        int[] count = new int[2001];

        count[1] = 1;
        count[2] = 2;
        
        if (n == 1) return count[1];
        if (n == 2) return count[2];
        
        for (int i = 3; i <= n; i++) {
            count[i] = (count[i - 1] + count[i - 2]) % 1234567;
        }

        return count[n];
    }
}