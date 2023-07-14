class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String str = Integer.toString(array[i]);
            String[] result = str.split("");
            for (int j = 0; j < result.length; j++) {
                if (result[j].equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}