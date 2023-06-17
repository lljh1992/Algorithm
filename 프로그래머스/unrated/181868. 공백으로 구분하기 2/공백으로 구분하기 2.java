class Solution {
    public String[] solution(String my_string) {
        // trim()을 사용하여 문자열의 앞, 뒤 공백을 제거
        my_string = my_string.trim();
        // split으로 answer배열에 값을 넣음
        
        // 정규식 표현 \\s 스페이스 한칸을 인식
        // 공백이 가변적인 경우 1개 이상의 공백이 있는
        // 데이터를 정상적으로 잘라내고싶다면 \\s+ 사용
        String[] answer = my_string.split("\\s+");
        return answer;
    }
}