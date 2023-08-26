import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] result = s.split("");
        Arrays.sort(result, Collections.reverseOrder());
        for (int i = 0; i < result.length; i++) {
            answer += result[i];
        }
        return answer;
    }
}