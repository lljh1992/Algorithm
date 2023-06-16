class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        // my_string에서 alp를 찾아 alp.toUpperCase()로 대체 한다.
        // 이렇게 하면 해당하는 모든 부분이 대문자로 변환된다.
        String result = my_string.replaceAll(alp, alp.toUpperCase());
        answer = result;
        return answer;
    }
}