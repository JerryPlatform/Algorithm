import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();

        for (String i : s.split("")) {
            list.add(i);
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || (i > 1 && list.get(i - 1).equals(" "))) {
                try {
                    answer += list.get(i).toUpperCase();
                } catch (Exception e) {
                    answer += list.get(i).toLowerCase();
                }
            } else {
                answer += list.get(i).toLowerCase();
            }
        }
        
        return answer;
    }
}