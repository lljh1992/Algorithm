class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
                // 3의 배수이거나 3을 포함하고있으면 +1 
            }
        }
        return answer;
    }
}