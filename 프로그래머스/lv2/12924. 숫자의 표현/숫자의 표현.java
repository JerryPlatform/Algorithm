import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int check = i;
            int count = check;
            while (check < n) {
                count++;
                check = check + count;
            }
            if (check == n) answer++;
        }
        return answer;
    }
}