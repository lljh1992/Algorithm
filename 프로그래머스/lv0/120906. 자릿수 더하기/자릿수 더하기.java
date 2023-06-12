class Solution {
    public int solution(int n) {
        int answer = 0;
        String m = Integer.toString(n);
        for (int i =0; i < m.length(); i++) {
            answer+= Integer.parseInt(m.substring(i, i+1));
        }
        return answer;
    }
}