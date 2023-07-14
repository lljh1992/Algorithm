import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String[] str = new String[intStrs.length];
        for (int i = 0; i < intStrs.length; i++) {
            str[i] = intStrs[i].substring(s, s+l);
        }
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) > k) {
                count++;
            }
            }
        int[] answer = new int[count];
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) > k) {
                answer[index++] = Integer.parseInt(str[i]);
        }
        
    }
        return answer;
}
}