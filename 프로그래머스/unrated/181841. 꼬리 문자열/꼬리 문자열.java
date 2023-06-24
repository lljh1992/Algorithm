class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) {
            // contains() 대상문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
            if (!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        return answer;
    }
}