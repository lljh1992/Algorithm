class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) { //0부터 매개변수로 들어온 array배열의 크기까지 for문 실행
            if (array[i] == n) {    // array의 i번째 수와 매개변수로 들어온 정수 n과 같다면
                answer ++;          // answer + 1
            }
        }
        return answer;
    }
}