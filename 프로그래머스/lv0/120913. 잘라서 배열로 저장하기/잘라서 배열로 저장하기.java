class Solution {
    public String[] solution(String my_str, int n) {
        int length = 0;
        if (my_str.length() % n == 0) {
            length = my_str.length() / n;
        } else {
            length = my_str.length() / n + 1;
        }
        String[] answer = new String[length];
        int count = 0;
        for(int i = 0; i < answer.length; i++){
            String str = "";
            for (int j = count; j < my_str.length(); j++) {
                str += my_str.charAt(j);
                count++;
                if (count % n == 0) {
                    break;
                }
            }
            answer[i] = str;
        }
        return answer;
    }
}