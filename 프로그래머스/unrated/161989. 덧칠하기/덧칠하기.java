import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = section[0] - 1;
        
        for(int num : section) {
            if (idx < num) {
                answer++;
                idx = num + m - 1;
            }
        }
        
        return answer;
    }
}