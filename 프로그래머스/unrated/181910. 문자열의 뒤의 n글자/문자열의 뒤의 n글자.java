class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        // substring() 메서드는 문자열의 특정 부분을 잘라내는 데 사용
        answer = my_string.substring(my_string.length() -n);
        return answer;
    }
}