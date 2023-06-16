class Solution {
    public String solution(String myString) {
        String answer = "";
        String result = myString.toLowerCase();
        result = result.replace("a", "A");
        answer = result;
        return answer;
    }
}