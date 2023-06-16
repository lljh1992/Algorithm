class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char result = my_string.charAt(i);
            if (Character.isLowerCase(result)) {
                answer += Character.toUpperCase(result);
            } else {
                answer += Character.toLowerCase(result);
            }
        }
        return answer;
    }
}