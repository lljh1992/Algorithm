class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len = intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2;
        int[] answer = new int[len];
        int index = 0;
        for(int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            for(int j = start; j <= end; j++){
                answer[index++] = arr[j];
            }
        }
        return answer;
    }
}