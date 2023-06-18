import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            sum.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            sum.add(num_list[i]);
        }
        for (int i = 0; i < sum.size(); i++) {
            answer[i] = sum.get(i);
        }
        return answer;
    }
}