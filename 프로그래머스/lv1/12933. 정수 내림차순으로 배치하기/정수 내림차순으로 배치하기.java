import java.util.*;
class Solution {
    public long solution(long n) {
        String a = String.valueOf(n);
        String[] b = a.split("");
        Arrays.sort(b, Collections.reverseOrder());
        String c = "";
        for (int i = 0; i < b.length; i++) {
            c += b[i];
        }
        long answer = Long.parseLong(c);
        return answer;
    }
}