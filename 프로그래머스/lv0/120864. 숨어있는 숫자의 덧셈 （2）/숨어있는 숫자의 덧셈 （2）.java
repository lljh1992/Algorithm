class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        String[] str = my_string.split(" "); // 공백으로 하지 않으면 1,2,3,4 이렇게 됨
        // for (int i = 0; i < str.length; i++) {
        //     System.out.println(str[i]);
        // }
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                answer += Integer.parseInt(str[i]);
            }
        }
        
        return answer;
    }
}