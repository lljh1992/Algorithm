class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        // 주어진 문자열을 문자 어레이로 변환
        char[] chars = my_string.toCharArray();
        // temp를 초기화
        char temp = ' ';
        
        // chars 배열에서 인덱스 num1과 num2에 해당하는 문자를
        // 교환하기 위해 chars[num2]를 chars[num1]에 대입하고
        // 그 반대도 수행합니다.
        temp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = temp;
        // String 클래스의 valueOf 메서드를 사용하여 
        // 수정된 문자 배열을 다시 문자열로 변환합니다.
        my_string = String.valueOf(chars);
        answer = my_string;
        return answer;
    }
}