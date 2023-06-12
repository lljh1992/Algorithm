import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length];   // num_list와 같은 길이로 생성
        
        for (int i = 0; i < num_list.length; i++) { 
            answer[i] = num_list[num_list.length-i-1];
            // i = 3 이라면 5 - 3 - 1 = num_list[1]의 값을 answer[i]에 저장
        }
        return answer;
    }
}