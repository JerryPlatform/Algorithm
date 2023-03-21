import java.util.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Set<Integer> member1 = new HashSet<>();
        Map<Integer, Integer> member2 = new HashMap<>();

        for (int i = 0; i < topping.length; i++) {
            member2.put(topping[i], member2.getOrDefault(topping[i], 0) + 1);
        }

        for (int i = 0; i < topping.length; i++) {
            int num = topping[i];

            member1.add(num);
            if (member2.containsKey(num)) {
                member2.put(num, member2.get(num) - 1);
                if (member2.get(num) == 0) {
                    member2.remove(num);
                }
            }

            if (member1.size() == member2.keySet().size()) {
                answer++;
            }
        }

        return answer;
    }
}