class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            answer[index++] = ((long)i * x);
        }
        return answer;
    }
}