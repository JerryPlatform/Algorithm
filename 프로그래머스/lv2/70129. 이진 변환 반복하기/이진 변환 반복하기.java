import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int loopCount = 0;
        int zeroCount = 0;

        while (!s.equals("1")) {
            loopCount++;
            String temp = "";
            for (char i : s.toCharArray()) {
                if (i == '0') {
                    zeroCount++;
                } else {
                    temp += i;
                }
            }
            s = Integer.toBinaryString(temp.length());
        }
        answer[0] = loopCount;
        answer[1] = zeroCount;
        return answer;
    }
}