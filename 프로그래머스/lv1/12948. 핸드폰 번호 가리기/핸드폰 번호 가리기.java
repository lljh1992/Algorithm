class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] a = phone_number.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (i > a.length -5) {
                answer += a[i];
            } else {
                answer += "*";
            }
        }
        return answer;
    }
}