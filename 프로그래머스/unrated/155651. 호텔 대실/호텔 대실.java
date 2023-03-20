import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;

        int[] rooms = new int[2450];

        for (String[] time : book_time) {
            int start = Integer.parseInt(time[0].replace(":", "")) + 1;
            int end = Integer.parseInt(time[1].replace(":", "")) + 10;

            if (end % 100 > 59) {
                end += 100;
                end -= 60;
            }
            
            rooms[start]++;
            rooms[end+1] = rooms[end+1] - 1;
        }

        for (int i = 1; i < 2450; i++) {
            rooms[i] += rooms[i-1];
            answer = Math.max(answer, rooms[i]);
        }

        return answer;
    }
}