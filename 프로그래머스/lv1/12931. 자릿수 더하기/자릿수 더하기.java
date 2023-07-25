import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String result = n + "";
        String[] sum = result.split("");
        for (int i = 0; i < sum.length; i++) {
            answer += Integer.parseInt(sum[i]);
        }

        return answer;
    }
}