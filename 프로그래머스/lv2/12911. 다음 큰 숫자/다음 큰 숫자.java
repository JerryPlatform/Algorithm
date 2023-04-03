import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        int answer = n;

        long nowBinaryStringCount = Integer.bitCount(n);

        while (true) {
            answer++;
            long nextBinaryStringCount = Integer.bitCount(answer);
            if (nowBinaryStringCount == nextBinaryStringCount) break;
        }

        return answer;
    }
}