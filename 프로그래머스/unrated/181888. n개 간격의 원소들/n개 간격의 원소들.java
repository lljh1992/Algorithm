import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        Vector v = new Vector();
        
        // 반복문을 이용하여 n간격 만큼 벡터에 저장
        for (int i = 0; i < num_list.length; i+= n) {
            v.add(num_list[i]);
        }
        
        // 리턴할 배열 크기를 벡터 사이즈로 결정
        int[] answer = new int[v.size()];
        // 반복문을 통해 백터에 저장된 값을 배열에 저장
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int)v.get(i);
        }
        return answer;
    }
}