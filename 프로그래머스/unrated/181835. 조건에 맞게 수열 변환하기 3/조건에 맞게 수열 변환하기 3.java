class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) {
                answer[index++] = arr[i] * k;
            } else if (k % 2 == 0) {
                answer[index++] = arr[i] + k;
            }
        }
        return answer;
    }
}