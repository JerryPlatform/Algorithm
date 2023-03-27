import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        for (char i : s.toCharArray()) {
            count += i == '(' ? 1 : -1;
            if (count < 0) return false;
        }
        if (count != 0) return false;

        return answer;

    }
}