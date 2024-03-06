import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        int[] ka = Arrays.stream(arr).distinct().toArray();
        int len = ka.length;
        for(int i = 0; i < answer.length; i++) {
            if (len != 0) {
                len--;
                answer[i] = ka[i];
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}