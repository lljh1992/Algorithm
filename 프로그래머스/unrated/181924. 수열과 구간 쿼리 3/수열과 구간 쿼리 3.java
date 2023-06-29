class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int x =0;
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            x = arr[end];
            arr[end] = arr[start];
            arr[start] = x;
        }
        return arr;
    }
}