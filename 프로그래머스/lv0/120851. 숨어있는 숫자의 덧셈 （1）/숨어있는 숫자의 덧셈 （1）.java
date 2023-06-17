class Solution {
    public int solution(String my_string) {
        // 먼저, 문자열 my_String에서 숫자만 추출하여 배열 arr에 넣어준다.
        String[] arr = my_string.replaceAll("[^0-9]", "").split("");
        int answer = 0; // 합을 나타내는 answer을 초기화
        // 배열 arr의 원소들을 answer에 차례대로 더해준다.
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}