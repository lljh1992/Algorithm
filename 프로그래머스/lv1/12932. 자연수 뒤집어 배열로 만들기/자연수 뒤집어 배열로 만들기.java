class Solution {
    public int[] solution(long n) {
        String res = String.valueOf(n);
        String[] res1 = res.split("");
        int[] answer = new int[res1.length];
        int index = 0;
        for (int i = res1.length - 1; i >= 0; i--) {
            answer[index++] = Integer.parseInt(res1[i]);
        }
        return answer;
    }
}