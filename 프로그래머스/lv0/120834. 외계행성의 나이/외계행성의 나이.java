class Solution {
    public String solution(int age) {
        String answer = "";
        char[] age1 = Integer.toString(age).toCharArray();
        int age2;
        for (int i = 0; i < age1.length; i++) {
            age2 = 0;
            age2 = (int)(age1[i] - '0') + 97;
            answer += (char) age2;
        }
        return answer;
    }
}