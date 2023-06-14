class Solution {
    public String solution(String my_string) {
        String answer = "";
        String sum = my_string.replaceAll("[aeiou]", "");       //replace([기존문자],[바꿀문자])
        answer = sum;
        return answer;
    }
}